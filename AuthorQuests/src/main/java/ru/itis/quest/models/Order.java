package ru.itis.quest.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(exclude = "user")
@EqualsAndHashCode
@Builder
public class Order {
    private Long id;
    private User user;
    private Map<Quest, Integer> questsCount = new HashMap<>();

    public void add(Quest product) {
        questsCount.put(product, questsCount.getOrDefault(product, 0) + 1);
    }

    public void deleteProduct(Quest product) {
        if (questsCount.getOrDefault(product,0) == 1){
            questsCount.remove(product);
        }else if(questsCount.getOrDefault(product,0) > 0) {
            questsCount.put(product, questsCount.getOrDefault(product, 0) - 1);
        }
    }
}
