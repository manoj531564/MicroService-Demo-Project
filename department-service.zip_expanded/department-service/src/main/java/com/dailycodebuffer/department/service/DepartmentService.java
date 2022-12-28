package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.controller.DepartmentController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department ) {
		log.info("Inside save method of Department service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById of Department service");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
