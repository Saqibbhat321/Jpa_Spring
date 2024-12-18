package com.xworkz.courseregistration.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "course_table")
@RequiredArgsConstructor
@Data
@NamedQuery(name = "findById", query = "Select cr from CourseEntity cr where cr.email =:em and cr.password=:pass")
public class CourseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "name")

    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
    @Column(name = "ph_no")
    private Long phNo;

}
