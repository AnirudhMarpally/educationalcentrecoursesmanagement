package com.gec.coursesmanagement.service;

import java.util.List;
import java.util.Optional;

import com.gec.coursesmanagement.model.Course;

public interface CoursesmanagementService {
	
	List<Course> getListOfCourses();
	void saveCourse(Course course);
	void removeCoursebyCourseId(Long courseId);
	void editcoursebyCourseId(Long courseId);
	public  Course getCourseData(Long courseId);
	

}
