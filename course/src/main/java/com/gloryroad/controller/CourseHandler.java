package com.gloryroad.controller;

import com.gloryroad.entity.Course;
import com.gloryroad.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/index")
    public String index() {
        return "course服务端口：" + this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Course> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return courseRepository.findAll(index, limit);
    }
}
