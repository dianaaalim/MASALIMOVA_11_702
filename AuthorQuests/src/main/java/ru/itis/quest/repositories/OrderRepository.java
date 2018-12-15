package ru.itis.quest.repositories;

import ru.itis.quest.models.Order;
import ru.itis.quest.models.Quest;

import java.util.List;
import java.util.Map;

public interface OrderRepository extends CrudRepository<Order> {
    Order findByOwnerId(Long ownerId);
    List<Quest> getProductList(Order cart);
    void addProduct(Order cart, Quest product);
    void deleteProductFromCart(Order cart, Quest product);
    Map<Quest, Integer> toMap(List<Quest> productList);
}
