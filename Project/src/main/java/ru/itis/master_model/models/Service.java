package ru.itis.master_model.models;

import lombok.*;

@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class Service {
    private Long id;
    private String name;
    private Double price;
}
