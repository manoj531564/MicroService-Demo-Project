package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.repository.CoursDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CoursDataJpaRepository coursDataJpaRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		coursDataJpaRepository.save(new Course(5l,"Learn react","manoj"));
	}
	
	

}
