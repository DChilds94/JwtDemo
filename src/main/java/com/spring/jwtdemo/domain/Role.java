package com.spring.jwtdemo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Role {

    private Integer id;
    private String description;
    private String roleName;



}
