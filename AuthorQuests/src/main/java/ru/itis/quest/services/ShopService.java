package ru.itis.quest.services;

import ru.itis.quest.models.Order;

import javax.servlet.http.Cookie;


public interface ShopService {
    Order buy(Long productId, Cookie[] cookies, UserService loginService);

}

