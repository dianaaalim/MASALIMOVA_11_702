package ru.itis.repositories;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.models.User;

import static org.junit.Assert.*;

public class UserRepositoryJdbcTemplateImplTest {

    private UserRepositoryJdbcTemplateImpl usersRepository;

    private final User EXPECTED = User.builder()
            .id(1L)
            .name("Диана")
            .build();

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgresql");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/basket_db");
        usersRepository = new UserRepositoryJdbcTemplateImpl(dataSource);
    }

    @Test
    public void find() {
        User actual = usersRepository.find(1L);
        assertEquals(EXPECTED, actual);
    }
}