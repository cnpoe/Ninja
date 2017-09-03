package com.udemy.converter;

import org.springframework.stereotype.Component;

import com.udemy.entity.Course;
import com.udemy.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	public CourseModel entity2Model(Course course){
		CourseModel courseModel = new CourseModel();
		courseModel.setDescription( course.getDescription() );
		courseModel.setHours( course.getHours() );
		courseModel.setName( course.getName() );
		courseModel.setPrice( course.getPrice() );
		return courseModel;
	}
	
	public Course model2Entity(CourseModel courseModel){
		Course course = new Course();
		course.setDescription( courseModel.getDescription() );
		course.setHours( courseModel.getHours() );
		course.setName( courseModel.getName() );
		course.setPrice( courseModel.getPrice() );
		return course;
	}
}
