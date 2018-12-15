package ru.itis.quest.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.itis.quest.models.Auth;

import ru.itis.quest.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthRowMapper implements RowMapper<Auth> {
    @Override
    public Auth mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String nickname = resultSet.getString("nickname");
        String firstName = resultSet.getString("first_name");
        String surname = resultSet.getString("surname");
        String phone = resultSet.getString("phone");
        String email = resultSet.getString("email");
        String hashPassword = resultSet.getString("hash_password");
        return Auth.builder()
                .cookieValue(resultSet.getString("cookie_value"))
                .user(new User(id, nickname, firstName, surname, phone, email, hashPassword, null))
                .id(resultSet.getLong("id"))
                .build();
    }
}