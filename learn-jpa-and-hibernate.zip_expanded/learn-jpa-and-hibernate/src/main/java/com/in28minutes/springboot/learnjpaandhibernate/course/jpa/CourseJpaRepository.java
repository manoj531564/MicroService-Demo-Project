package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
@Transactional
public class CourseJpaRepository{
	
	@PersistenceContext
	private EntityManager entiryManager;
	
	public void insert(Course course) {
		entiryManager.merge(course);
	}
	
	public Course findById(long id) {
		return entiryManager.find(Course.class, id);
	}
}
