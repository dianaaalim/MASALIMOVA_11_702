package ru.itis.quest.models;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Quest {
    private Long id;
    private String name;
    private String type;
    private Long cost;
    private Integer numberOfParticipants;
    private Integer freeParticipants;
    private Integer ageLimit;
    private District district;
    private Timestamp timeOfQuest;
}
