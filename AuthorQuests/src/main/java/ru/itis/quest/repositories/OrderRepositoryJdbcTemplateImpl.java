package ru.itis.quest.repositories;

import lombok.SneakyThrows;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.quest.models.Order;
import ru.itis.quest.models.Quest;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OrderRepositoryJdbcTemplateImpl implements OrderRepository {
    private JdbcTemplate jdbcTemplate;
    private UserRepository usersRepository;

    //language=SQL
    private static final String SQL_SELECT_CART_BY_ID =
            "select * from quest_order where id = ?";

    //language=SQL
    private static final String SQL_SELECT_CART_BY_OWNER_ID =
            "select * from quest_order where user_id = ?";

    //language=SQL
    private static final String SQL_INSERT_CART =
            "insert into quest_order(user_id) values (?)";

    //language=SQL
    private static final String SQL_UPDATE_CART =
            "update quest_order set user_id = ? where id = ?";

    //language=SQL
    private static final String SQL_INSERT_CART_PRODUCTS =
            "insert into cart_product(cart_id, product_id) values (?,?)";

    //language=SQL
    private static final String SQL_UPDATE_CART_PRODUCTS =
            "update cart_product set(cart_id,product_id) = (?,?) where cart_id = ?";

    //language=SQL
    private static final String SQL_SELECT_CART_PRODUCTS =
            "select * from cart_product,product where cart_id = ? and product.id = product_id";

    //language=SQL
    private static final String SQL_ADD_PRODUCT_TO_CART =
            "insert into cart_product(cart_id,product_id) values(?,?)";

    //language=SQL
    private static final String SQL_DELETE_PRODUCT_FROM_CART =
            "with row_id as (select id from cart_product where cart_id = ? and product_id = ?) delete from cart_product where id in(select id from row_id order by id desc limit 1)";

    private PreparedStatement insertCartProductsStatement;
    private PreparedStatement insertCartStatement;
    private PreparedStatement updateCartStatement;
    private PreparedStatement updateCartProductStatement;
    private PreparedStatement addProductStatement;
    private PreparedStatement deleteProductFromCartStatement;

    private RowMapper<Order> cartRowMapper = (resultSet, i) -> Order.builder()
            .id(resultSet.getLong("id"))
            .build();
    private RowMapper<Quest> productRowMapper = (resultSet, i) -> Quest.builder()
            .id(resultSet.getLong("product_id"))
            .name(resultSet.getString("name"))
            .cost(resultSet.getLong("cost"))
            .build();

    @SneakyThrows
    public OrderRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.usersRepository = new UserRepositoryJdbcTemplateImpl(dataSource);

        insertCartProductsStatement = dataSource.getConnection().prepareStatement(SQL_INSERT_CART_PRODUCTS);
        insertCartStatement = dataSource.getConnection().prepareStatement(SQL_INSERT_CART);
        updateCartStatement = dataSource.getConnection().prepareStatement(SQL_UPDATE_CART);
        updateCartProductStatement = dataSource.getConnection().prepareStatement(SQL_UPDATE_CART_PRODUCTS);
        addProductStatement = dataSource.getConnection().prepareStatement(SQL_ADD_PRODUCT_TO_CART);
        deleteProductFromCartStatement = dataSource.getConnection().prepareStatement(SQL_DELETE_PRODUCT_FROM_CART);
    }
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Optional<Order> find(Long id) {
        return Optional.empty();
    }

    @SneakyThrows
    @Override
    public void save(Order model) {
        for (Quest product : model.getQuestsCount().keySet()) {
            insertCartProductsStatement.setLong(1, model.getId());
            insertCartProductsStatement.setLong(2, product.getId());
            insertCartProductsStatement.executeUpdate();
        }

        insertCartStatement.setLong(1, model.getUser().getId());

        insertCartStatement.executeUpdate();

    }

    @Override
    public void delete(Long id) {

    }

    @SneakyThrows
    @Override
    public void update(Order model) {
        for (Quest product : model.getQuestsCount().keySet()) {
            updateCartProductStatement.setLong(1, model.getId());
            updateCartProductStatement.setLong(3, model.getId());
            updateCartProductStatement.setLong(2, product.getId());
            updateCartProductStatement.executeUpdate();
        }

        updateCartStatement.setLong(1, model.getUser().getId());
        updateCartStatement.setLong(2, model.getId());

        updateCartStatement.executeUpdate();

    }

    @Override
    public Order findByOwnerId(Long ownerId) {
        Order cart;
        try {
            cart = jdbcTemplate.queryForObject(SQL_SELECT_CART_BY_OWNER_ID, cartRowMapper, ownerId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }

        cart.setUser(usersRepository.find(ownerId).get());
        cart.setQuestsCount(toMap(getProductList(cart)));
        return cart;    }
    @Override
    public List<Quest> getProductList(Order cart) {
        return jdbcTemplate.query(SQL_SELECT_CART_PRODUCTS, productRowMapper, cart.getId());

    }

    @Override
    public void addProduct(Order cart, Quest product) {

    }

    @Override
    public void deleteProductFromCart(Order cart, Quest product) {

    }

    @Override
    public Map<Quest, Integer> toMap(List<Quest> productList) {
        return null;
    }
}