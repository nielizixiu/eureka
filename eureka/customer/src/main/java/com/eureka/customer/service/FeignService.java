package com.eureka.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "message-server")
public interface FeignService {
 
	@RequestMapping(value = "/v1/provider/msg/testmsg", method = RequestMethod.POST)
	public String getInfo();
}