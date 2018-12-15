package ru.itis.quest.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.itis.quest.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return User.builder()
                .id(resultSet.getLong("id"))
                .nickname(resultSet.getString("nickname"))
                .firstName(resultSet.getString("first_name"))
                .surname(resultSet.getString("surname"))
                .phone(resultSet.getString("phone"))
                .email(resultSet.getString("email"))
                .hashPassword(resultSet.getString("hash_password"))
                .build();
    }
}