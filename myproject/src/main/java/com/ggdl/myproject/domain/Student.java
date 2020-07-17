package com.ggdl.myproject.domain;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class Student {

    private Integer id;

    @NotEmpty(message="姓名不能为空！")
    private String name;

    @NotNull(message="年龄不能为空！")
    @Min(value=18,message="年龄必须大于18岁！")
    private Integer age;

}