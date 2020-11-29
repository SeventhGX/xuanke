package com.gloryroad.feign;

import com.gloryroad.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "course")
public interface CourseFeign {

    @GetMapping("/course/findAll/{index}/{limit}")
    List<Course> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);
}
