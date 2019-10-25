package com.spring.jwtdemo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String password;
    private String userName;

}
