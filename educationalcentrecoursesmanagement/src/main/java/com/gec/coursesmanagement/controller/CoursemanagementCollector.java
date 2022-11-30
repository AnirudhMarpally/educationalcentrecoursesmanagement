package com.gec.coursesmanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gec.coursesmanagement.model.Course;
import com.gec.coursesmanagement.service.CoursesmanagementService;

@RestController
public class CoursemanagementCollector {
	
	@Autowired
	private CoursesmanagementService coursemanagementservice;
	private Long courseId;
	
	@GetMapping("/home")
	public ModelAndView displayCourses(Model model) {
		ModelAndView mv = new ModelAndView("courses_homepage");
		mv.addObject("courselist", coursemanagementservice.getListOfCourses());
		return mv;
	}
	
	
	@GetMapping("/AddCourse")
	public ModelAndView AddingCourses(Model model) {
		ModelAndView mv = new ModelAndView("add_a_new_course_here");
		mv.addObject("courseform", new Course());
		return mv;
	}
	@PostMapping("/save")
	public ModelAndView addCourse(
			@ModelAttribute("courseform") Course course
			) {
		
		
		coursemanagementservice.saveCourse(course);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;
	}
	
	
	@GetMapping("/remove-the-course")
	public ModelAndView removeCourse( @RequestParam ("CourseId") Long courseId) {
		coursemanagementservice.removeCoursebyCourseId(courseId);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;
	}
	
	
	
	@GetMapping("/update-the-course")
	public ModelAndView updateCourse(@RequestParam ("CourseId") Long courseId) {
		ModelAndView mv = new ModelAndView("edit_the_course_here");
		Course updatedCourse = coursemanagementservice.getCourseData(courseId);
		
		mv.addObject("editform", updatedCourse );
		return mv;
	}
	@PostMapping("/update")
	public ModelAndView editCourse(
			@ModelAttribute("editform") Course course
			) {
		coursemanagementservice.saveCourse(course);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;
	}
	
	
	
	/*
	@GetMapping("/edit-course")
	public ModelAndView updateCourse( @RequestParam("CourseId") Long courseId) {
		
		Optional<Course> course = coursemanagementservice.fetechCoursebyCourseId(courseId);
		
		Course coursetemp = course.get();
		System.out.println(coursetemp.getCourseName());
		System.out.println(coursetemp.getFees());
		System.out.println(coursetemp.getDuration());
		
		ModelAndView mv = new ModelAndView("edit_the_course_here");
		//mv.addObject("courseid", coursetemp.getCourseId());
		mv.addObject("coursename", coursetemp.getCourseName());
		mv.addObject("fees", coursetemp.getFees());
		mv.addObject("duration", coursetemp.getDuration());
		
		return mv;
		
	}
	
	
	
	//PostMapping("/edit_course_in_the_list")
	@PostMapping("edit_the_course_here")
	public  ModelAndView doEdit(
			@ModelAttribute("CourseName") String CourseName,
			@ModelAttribute("Fees") Double Fees,
			@ModelAttribute("Duration") Integer Duration) {
		
		Course course = new Course(CourseId,CourseName, Fees, Duration);
		coursemanagementservice.saveCourse(course);
		ModelAndView mv = new ModelAndView("redirect:/courses_homepage");
		return mv;
	}
	
	*/
	
	
	
	
	
	
	
	
	

}
