package com.gec.coursesmanagement.service;

import java.util.List;
import java.util.Optional;
import com.gec.coursesmanagement.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.coursesmanagement.model.Course;
import com.gec.coursesmanagement.repository.CourseRepository;

@Service

public class coursesmanagementServiceImpl implements CoursesmanagementService{
	
	@Autowired
	CourseRepository courserepository;
	

	public CourseRepository getCourserepository() {
		return courserepository;
	}

	public void setCourserepository(CourseRepository courserepository) {
		this.courserepository = courserepository;
	}

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		courserepository.save(course);
		
	}

	@Override
	public void removeCoursebyCourseId(Long courseId) {
		// TODO Auto-generated method stub
		courserepository.deleteById(courseId);
		
	}
  
	/*
	@Override
	public void editcoursebyCourseId(Long courseId, Double fees, Integer duration) {
		// TODO Auto-generated method stub
		
		
	}
	*/
	@Override
	public void editcoursebyCourseId(Long courseId) {
		// TODO Auto-generated method stub
		courserepository.saveAll(null);
		
		
	}

	@Override
	public List<Course> getListOfCourses() {
		// TODO Auto-generated method stub
		return courserepository.findAll();
	}

	@Override
	public  Course getCourseData(Long courseId){
		
		Optional<Course> result = courserepository.findById(courseId);
		return result.get();	}

}
