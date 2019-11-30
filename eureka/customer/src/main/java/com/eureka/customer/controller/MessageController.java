package com.eureka.customer.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.customer.service.FeignService;



@RestController
@RequestMapping("/v1/customer")
public class MessageController {

	@Autowired
	FeignService feignService;
 
	@RequestMapping(value = "getmsg", method = RequestMethod.GET)
	public String fileServerInfo(HttpServletResponse response) {
		System.out.println(1111);
		return feignService.getInfo();
	}

}
