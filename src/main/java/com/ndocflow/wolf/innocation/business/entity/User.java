package com.ndocflow.wolf.innocation.business.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private Long id;
    private String name;
    private String password;
    private String email;

}