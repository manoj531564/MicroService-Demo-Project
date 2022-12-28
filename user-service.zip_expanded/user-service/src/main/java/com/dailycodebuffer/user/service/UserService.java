package com.dailycodebuffer.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.Users;
import com.dailycodebuffer.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Users saveUser(Users user) {
		log.info("Indise saveUser method of userService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of Userservice");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Users user = userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+
				user.getDepartmentId(),Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
	
	
}
