package com.udemy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.entity.Course;

@Service("courseServiceImpl")
public interface CourseService {
	public abstract List< Course > listAllCourses( );
	public abstract Course addCourse( Course course );
	public abstract int removeCourse( int id );
	public abstract Course updateCourse( Course course );
}
