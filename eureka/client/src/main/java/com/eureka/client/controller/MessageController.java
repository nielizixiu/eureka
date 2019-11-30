package com.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/provider/msg")
public class MessageController {
		
	
	@RequestMapping("testmsg")
	public String getTestMsg() {
		
		System.out.println("!!!!!!!~-------------msg");
		return "msg5618451651895612313";
	}
}
