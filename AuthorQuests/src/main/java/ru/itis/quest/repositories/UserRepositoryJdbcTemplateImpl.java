package ru.itis.quest.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.quest.models.User;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class UserRepositoryJdbcTemplateImpl implements UserRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID =
            "select * from quest_user where id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_USERS =
            "select * from quest_user";

    //language=SQL
    private static final String SQL_INSERT =
            "insert into quest_user(nickname, first_name, surname, phone, email, hash_password) values (?, ?, ?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_BY_NICKNAME =
            "select * from quest_user where nickname = ?";

    private RowMapper<User> userRowMapper = (resultSet, i) -> User.builder()
            .id(resultSet.getLong("id"))
            .nickname(resultSet.getString("nickname"))
            .firstName(resultSet.getString("first_name"))
            .surname(resultSet.getString("surname"))
            .phone(resultSet.getString("phone"))
            .email(resultSet.getString("email"))
            .hashPassword(resultSet.getString("hash_password"))
            .build();

    public UserRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Optional<User> findByNickname(String nickname) {
        return Optional.of(jdbcTemplate.queryForObject(SQL_SELECT_BY_NICKNAME, userRowMapper, nickname));
    }


    @Override
    public List<User> findAll() {
        {
            return jdbcTemplate.query(SQL_SELECT_ALL_USERS, userRowMapper);
        }
    }

    @Override
    public Optional<User> find(Long id) {
        return Optional.of(jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_ID,
                userRowMapper, id));
    }

    @Override
    public void save(User model) {
        jdbcTemplate.update(SQL_INSERT, model.getNickname(), model.getFirstName(), model.getSurname(), model.getPhone(), model.getEmail(), model.getHashPassword());
    }

    @Override
    public void delete(Long id) {

    }


    @Override
    public void update(User model) {

    }


}
