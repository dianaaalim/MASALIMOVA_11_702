package ru.itis.master_model.models;

import lombok.*;

import java.net.URL;
import java.util.List;

@Getter
@Builder
@Setter
@ToString
@EqualsAndHashCode
public class Client{
    private User client;
    private URL photo;
    private Long bonus;
}
