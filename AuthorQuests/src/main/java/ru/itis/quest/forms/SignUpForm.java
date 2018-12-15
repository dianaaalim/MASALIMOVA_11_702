package ru.itis.quest.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpForm {
    private String nickname;
    private String firstName;
    private String surname;
    private String phone;
    private String email;
    private String password;
}
