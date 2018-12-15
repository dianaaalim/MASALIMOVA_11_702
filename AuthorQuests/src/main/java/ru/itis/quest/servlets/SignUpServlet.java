package ru.itis.quest.servlets;

import ru.itis.quest.forms.SignUpForm;
import ru.itis.quest.services.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nickname = req.getParameter("nickname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String firstName = req.getParameter("firstName");
        String surname = req.getParameter("surname");
        String phone = req.getParameter("phone");

        SignUpForm form = SignUpForm.builder()
                .nickname(nickname)
                .firstName(firstName)
                .surname(surname)
                .phone(phone)
                .email(email)
                .password(password)
                .build();
        userService.signUp(form);

        resp.sendRedirect("/signIn");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        this.userService = (UserService) context.getAttribute("userService");
    }

}
