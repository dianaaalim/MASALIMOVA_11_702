package ru.itis.quest.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class District {
    private Long id;
    private String name;
}
