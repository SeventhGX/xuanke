package com.gloryroad.repository;

import com.gloryroad.entity.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> findAll(int index, int limit);
    Course findByCode(String code);
    void add(Course course);
    void deleteByCode(String code);
}
