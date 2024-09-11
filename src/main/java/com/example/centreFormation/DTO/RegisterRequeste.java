package com.example.centreFormation.DTO;

import com.example.centreFormation.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class RegisterRequeste {
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private Role role;
}
