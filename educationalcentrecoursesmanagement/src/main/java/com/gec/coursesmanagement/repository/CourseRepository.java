package com.gec.coursesmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gec.coursesmanagement.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
