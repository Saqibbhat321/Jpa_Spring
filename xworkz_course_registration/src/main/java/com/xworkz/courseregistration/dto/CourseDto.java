package com.xworkz.courseregistration.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data

@RequiredArgsConstructor
public class CourseDto {




    private  int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String confirmPassword;
    private Long phNo;
}
