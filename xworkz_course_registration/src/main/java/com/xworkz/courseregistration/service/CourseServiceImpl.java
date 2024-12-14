package com.xworkz.courseregistration.service;

import com.xworkz.courseregistration.dto.CourseDto;
import com.xworkz.courseregistration.entity.CourseEntity;
import com.xworkz.courseregistration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseService service;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String save(CourseDto dto) {


        String msg = "null";
        if (dto != null) {
            if (dto.getName().length() == 10) {
                System.out.println("name is valid " + dto.getName());
                if (dto.getAge() >= 18) {
                    System.out.println("age is valid");
                    if (dto.getPhNo().toString().startsWith("9") && dto.getPhNo().toString().length() == 10) {
                        System.out.println("number is valid " + dto.getPhNo());
                        if (dto.getEmail().contains("@") && dto.getEmail().endsWith("gmail.com")) {
                            System.out.println("email is valid " + dto.getEmail());
                            if (dto.getPassword().length() > 5) {
                                System.out.println("password is valid " + dto.getPassword());
                                if (dto.getPassword().equals(dto.getConfirmPassword())) {
                                    System.out.println("Passwords do match.");

                                    CourseEntity entity = new CourseEntity();

                                    entity.setName(dto.getName());
                                    entity.setEmail(dto.getEmail());
                                    entity.setAge((dto.getAge()));
                                    entity.setPhNo(dto.getPhNo());
                                    entity.setPassword(dto.getPassword());
                                    entity.setConfirmPassword(dto.getConfirmPassword());
                                    boolean saved = courseRepository.save(entity);

                                } else {
                                    System.out.println("confirm password does not match");
                                    msg = "password is not matching";
                                }
                            } else {
                                System.out.println(" invalid password");
                                msg = "password incorrect";
                            }
                        } else {
                            System.out.println("email is invalid");
                            msg = "inavalid email";
                        }
                    } else {
                        System.out.println("number is invalid");
                        msg = "number invalid";
                    }
                } else {
                    System.out.println("age is invalid");
                    msg = "invalid age";
                }
            } else {
                System.out.println("name is invalid");
                msg = "invalid name";
            }

        }
        return msg;
    }

    @Override
    public String getName(String email, String password) {

        String valid =courseRepository.getName(email, password);

        return valid;
    }
}