package ru.itis.master_model.models;

import lombok.*;

@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class City {
    private Long id;
    private String name;
}
