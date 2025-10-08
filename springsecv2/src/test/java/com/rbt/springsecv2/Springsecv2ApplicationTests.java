package com.rbt.springsecv2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.rbt.springsecv2.controller.HomeController;
import com.rbt.springsecv2.service.CustomUserService;

@SpringBootTest
class Springsecv2ApplicationTests {
	  @Autowired
      private HomeController homeController;
	  
	  @MockBean
      private CustomUserService customUserService; // Mock the service within the Spring context

	@Test
	void contextLoads() {
	}

}
