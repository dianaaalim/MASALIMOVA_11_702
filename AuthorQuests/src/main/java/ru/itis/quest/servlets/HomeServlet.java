package ru.itis.quest.servlets;

import ru.itis.quest.forms.SignInForm;
import ru.itis.quest.services.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgresql";
    private static final String URL = "jdbc:postgresql://localhost:5432/quests_db";

    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
    }


}
