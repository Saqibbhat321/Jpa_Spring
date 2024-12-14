package com.xworkz.courseregistration.repository;

import com.xworkz.courseregistration.entity.CourseEntity;

public interface CourseRepository {

    boolean save(CourseEntity entity);
    String getName(String email,String password);
}
