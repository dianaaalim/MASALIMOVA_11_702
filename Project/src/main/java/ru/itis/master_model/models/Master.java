package ru.itis.master_model.models;

import lombok.*;

import java.util.List;


@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class Master{
    private User master;
    private String workExperience;
    private Boolean canDeparture;
    private String education;
    private String address;

    private List<Service> services;
}
