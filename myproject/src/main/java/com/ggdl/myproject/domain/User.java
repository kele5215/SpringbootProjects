package com.ggdl.myproject.domain;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class User {

    private Long id;

    @NotNull
    @Size(min = 2, max = 5)
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Max(100)
    @Min(10)
    private Integer age;

}