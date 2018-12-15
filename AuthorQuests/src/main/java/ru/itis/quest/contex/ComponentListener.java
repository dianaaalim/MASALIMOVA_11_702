package ru.itis.quest.contex;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.quest.repositories.*;
import ru.itis.quest.services.UserService;
import ru.itis.quest.services.UserServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ComponentListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgresql");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/quests_db");
        UserRepository usersRepository = new UserRepositoryJdbcTemplateImpl(dataSource);
        servletContextEvent.getServletContext().setAttribute("userRepository", usersRepository);
        AuthRepository authRepository = new AuthRepositoryJdbcTemplateImpl(dataSource);
        servletContextEvent.getServletContext().setAttribute("authRepository", authRepository);
        QuestRepository questRepository = new QuestRepositoryJdbcTemplateImpl(dataSource);
        servletContextEvent.getServletContext().setAttribute("questRepository", questRepository);
//        OrderRepository orderRepository = new OrderRepositoryJdbcTemplateImpl(dataSource);
//        servletContextEvent.getServletContext().getAttribute("orderRepository", orderRepository);
        UserService userService = new UserServiceImpl(usersRepository, authRepository);
        servletContextEvent.getServletContext().setAttribute("userService", userService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
