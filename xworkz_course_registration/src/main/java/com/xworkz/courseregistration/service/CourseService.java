package com.xworkz.courseregistration.service;

import com.xworkz.courseregistration.dto.CourseDto;
import com.xworkz.courseregistration.entity.CourseEntity;

public interface CourseService {

    String save(CourseDto dto);
    String getName(String email,String password);

}
