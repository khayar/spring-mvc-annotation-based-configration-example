package com.test.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.HelloWorldModel;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String handler(Model model) {
		HelloWorldModel helloworldModel = new HelloWorldModel();
		helloworldModel.setMessage("Spring MVC annotation based example Hello World");
		helloworldModel.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloworld", helloworldModel);
		return "helloworld";
	}
}
