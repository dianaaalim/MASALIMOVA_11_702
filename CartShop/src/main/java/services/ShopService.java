package services;

import models.Cart;

import javax.servlet.http.Cookie;

public interface ShopService {
    Cart buy(Long productId, Cookie[] cookies, LoginService loginService);

    Cart deleteFromCart(Long productId, Cookie[] cookies, LoginService loginService);

    Cart getUserCart(LoginService loginService, Cookie[] cookies);
}
