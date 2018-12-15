package ru.itis.quest.services;

import ru.itis.quest.forms.SignInForm;
import ru.itis.quest.forms.SignUpForm;
import ru.itis.quest.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void signUp(SignUpForm form);
    Optional<String> signIn(SignInForm form);
    Optional<User> getUserByCookie(String cookieValue);
    boolean isExistByCookie(String cookieValue);
//    Order getOrderByUserId(Long id);
//    void addOrder(Long userId, Long questestId);

//    void updateProfile(ProfileForm form);
}
