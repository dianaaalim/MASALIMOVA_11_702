package ru.itis.quest.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private String nickname;
    private String firstName;
    private String surname;
    private String phone;
    private String email;
    private String hashPassword;

    private List<Order> orders;
}
