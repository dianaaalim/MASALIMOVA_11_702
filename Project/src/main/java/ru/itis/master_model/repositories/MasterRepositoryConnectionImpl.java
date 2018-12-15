package ru.itis.master_model.repositories;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import lombok.SneakyThrows;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import ru.itis.master_model.mappers.RowMapper;
import ru.itis.master_model.models.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MasterRepositoryConnectionImpl extends UserRepositoryConnectionImpl implements MasterRepositiry {

    private Connection connection;
    //Карта, которая хранит единственного мастера и список его заказов
    private Map<Master, List<Order>> masterWithOrderMap;

    // Карта, которая хранит id-шники всех
    // мастеров и объекты самих мастеров, внутри
    // которых уже хранятся заказы
    private Map<Long, Master> masterIdWithOrdersMap;

    // временная переменная, которая хранит текущего мастера
    private Master theOnlyMaster;
    private User theOnlyUser; //??????????

    //SQL!

    //language=SQL
    private static final String SQL_SELECT_MASTER_WITH_ORDERS_BY_ID =
            "select order_table.id as order_id, * " +
                    "from master_user " +
                    "       join order_table on master_user.id = order_table.id_master" +
                    "where master_user.id = ?;";

    //language=SQL
    private static final String SQL_SELECT_MASTERS_WITH_ORDERS =
            "select order_table.id as order_id, * " +
                    "from master_user " +
                    "       join order_table on master_user.id = order_table.id_master" +
                    "order by master_user.id;";

    //language=SQL
    private static final String SQL_SELECT_MASTER_BY_ADDRESS =
            "select * from master_user where address= ?";

    public MasterRepositoryConnectionImpl(Connection connection) {
        this.connection = connection;
    }




    //RowMapper который вытаскивает информацию только о пользователе
    private RowMapper<Master> masterWithoutOrdersRowMapper = new RowMapper<Master>() {
        @Override
        @SneakyThrows
        public Master rowMap(ResultSet resultSet) {
            return Master.builder() //Как вставить services?
                    .master(theOnlyUser)
                    .services()
                    .address(resultSet.getString("address"))
                    .canDeparture(resultSet.getBoolean("can_departure"))
                    .education(resultSet.getString("education"))
                    .workExperience(resultSet.getString("work_experience"))
                    .build();
        }
    };

    @Override
    public void create(User model) {

    }

    @Override
    public void update(Long id, User model) {

    }

    @SneakyThrows
    @Override
    public Optional<Master> findAllByAddress(String address) {
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_MASTER_BY_ADDRESS);
        statement.setString(1, address);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()) {
            return  Optional.empty();
        }
        return Optional.of(masterWithoutOrdersRowMapper.rowMap(resultSet));
    }


    // RowMapper, который работает так, что помимо информации
    // о пользователе вытаскивает информацию
    // по заказам
    
//    //language=SQL
//    private static final String SQL_INSERT_QUERY = "insert into active_users(first_name, last_name, email,  hashpassword) " +
//            "values (?, ?, ?, ?);";
//    //language=SQL
//    private static final String SQL_UPDATE_QUERY = "update active_users set first_name = ?, last_name = ?, username = ?, hashpassword = ? where id = ?";
//
//    public MasterRepositoryConnectionImpl(Connection connection) {
//        this.connection = connection;
//    }
//
//    private RowMapper<User> userRowMapper = new RowMapper<User>() {
//        @Override
//        @SneakyThrows
//        public User rowMap(ResultSet resultSet) {
//            return User.builder()
//                    .id(resultSet.getLong("id"))
//                    .email(resultSet.getString("email"))
//                    .hashPassword(resultSet.getString("hash_password"))
//                    .firstName(resultSet.getString("first_name"))
//                    .lastName(resultSet.getString("last_name"))
//                    .build(); //role и city как вставить?
//        }
//    };
//    @SneakyThrows
//    @Override
//    public List<User> findAllByCity(City city) {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet =
//                statement.executeQuery("SELECT * FROM main_user WHERE city_id=" + city.getId());
//        List<User> users = new ArrayList<>();
//        while (resultSet.next()) {
//            User newUser = userRowMapper.rowMap(resultSet);
//            users.add(newUser);
//        }
//        return users;
//    }
//
//    @SneakyThrows
//    @Override
//    public List<User> findAllByFirstName(String firstName) {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet =
//                statement.executeQuery("SELECT * FROM main_user WHERE first_name=" + firstName);
//        List<User> users = new ArrayList<>();
//        while (resultSet.next()) {
//            User newUser = userRowMapper.rowMap(resultSet);
//            users.add(newUser);
//        }
//        return users;
//    }
//
//    @Override
//    @SneakyThrows
//    public List<User> findAll() {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet =
//                statement.executeQuery("SELECT * FROM main_user");
//        List<User> users = new ArrayList<>();
//        while (resultSet.next()) {
//            User newUser = userRowMapper.rowMap(resultSet);
//            users.add(newUser);
//        }
//        return users;
//    }
//
//


}
