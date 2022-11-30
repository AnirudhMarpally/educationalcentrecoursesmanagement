package com.gec.coursesmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	private Double fees;
	private Integer duration;
	
	
	
	public Course(Long courseId, String courseName, Double fees, Integer duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.duration = duration;
	}
	public Course() {
		// TODO Auto-generated constructor stub 
	}

	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", duration="
				+ duration + "]";
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	

}
