package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String email;
    private String hashPassword;
    private String name;
    private String phone;
}
