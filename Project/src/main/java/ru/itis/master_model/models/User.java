package ru.itis.master_model.models;

import lombok.*;

import java.util.List;

@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String hashPassword;
    private City city;

}
