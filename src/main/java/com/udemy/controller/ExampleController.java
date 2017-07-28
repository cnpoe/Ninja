package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;
import com.udemy.model.Person;
import com.udemy.service.ExampleService;



@Controller
@RequestMapping("/example")
public class ExampleController {
	
	/*
	 * Autowired caraga el componente en la memoria
	 * Qualifier indica el nombre del compoenente
	 * */
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	public static final String EXAMPLE_VIEW = "example"; 
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	@GetMapping("/exampleString")
	public String exampleString(Model model){
		exampleComponent.sayHello();
		model.addAttribute( "people", exampleService.getListPeople() );
		return EXAMPLE_VIEW;
	}
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject( "people", exampleService.getListPeople() );
		return mav;
	}
	
	
}
