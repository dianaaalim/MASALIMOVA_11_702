package ru.itis.master_model.models;


import lombok.*;

import java.sql.Timestamp;

@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class Order {
    private Long id;
    private Master master;
    private Client client;
    private Service service;
    private Timestamp date;

}
