package com.nura.lockin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    private String userId;
    private String userName;
    private String email;
    private String password;
}
