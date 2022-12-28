package com.in28minutes.springboot.learnjpaandhibernate.course.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

public interface CoursDataJpaRepository extends JpaRepository<Course, Long>{

}
