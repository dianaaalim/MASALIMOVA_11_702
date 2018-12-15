package ru.itis.quest.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.quest.forms.SignInForm;
import ru.itis.quest.forms.SignUpForm;
import ru.itis.quest.models.Auth;
import ru.itis.quest.models.Order;
import ru.itis.quest.models.Quest;
import ru.itis.quest.models.User;
import ru.itis.quest.repositories.AuthRepository;
import ru.itis.quest.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    private AuthRepository authRepository;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, AuthRepository authRepository) {
        this.authRepository = authRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .nickname(form.getNickname())
                .firstName(form.getFirstName())
                .surname(form.getSurname())
                .phone(form.getPhone())
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .build();
        userRepository.save(user);
    }

    @Override
    public Optional<String> signIn(SignInForm form) {
        Optional<User> candidate = userRepository.findByNickname(form.getNickname());

        if (candidate.isPresent()) {
            User user = candidate.get();
            if (passwordEncoder.matches(form.getPassword(), user.getHashPassword())) {
                String cookieValue = UUID.randomUUID().toString();
                Auth auth = Auth.builder()
                        .cookieValue(cookieValue)
                        .user(user)
                        .build();
                authRepository.save(auth);

                return Optional.of(cookieValue);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByCookie(String cookieValue) {
        Auth auth;
        Optional<Auth> candidate = authRepository.getByCookie(cookieValue);
        if(candidate.isPresent()) {
            auth = candidate.get();
            Optional<User> user = userRepository.find(auth.getUser().getId());
            if (user.isPresent()) {
                return user;
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean isExistByCookie(String cookieValue) {
        return authRepository.getByCookie(cookieValue) != null;
    }




}


