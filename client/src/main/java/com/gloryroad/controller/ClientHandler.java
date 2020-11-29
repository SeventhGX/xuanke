package com.gloryroad.controller;

import com.gloryroad.entity.Course;
import com.gloryroad.feign.CourseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientHandler {

    @Autowired
    private CourseFeign courseFeign;

    @GetMapping("/findAll/{index}/{limit}")
    public List<Course> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        return courseFeign.findAll(index, limit);
    }
}
