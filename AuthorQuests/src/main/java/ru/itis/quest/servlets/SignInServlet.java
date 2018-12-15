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

@WebServlet("/signIn")

public class SignInServlet extends HttpServlet {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgresql";
    private static final String URL = "jdbc:postgresql://localhost:5432/quests_db";


    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/signIn.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SignInForm form = SignInForm.builder()
                .nickname(req.getParameter("nickname"))
                .password(req.getParameter("password"))
                .build();

        Optional<String> cookieValueCandidate = userService.signIn(form);
        if (cookieValueCandidate.isPresent()) {
            Cookie auth = new Cookie("auth", cookieValueCandidate.get());
            resp.addCookie(auth);
            resp.sendRedirect("/home");
        } else {
            resp.sendRedirect("/signIn");
        };
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        this.userService = (UserService)context.getAttribute("userService");
    }

}
