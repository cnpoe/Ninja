package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;



@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example"; 
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	@GetMapping("/exampleString")
	public String exampleString(Model model){
		model.addAttribute( "people", getPeople() );
		return EXAMPLE_VIEW;
	}
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject( "people", getPeople() );
		return mav;
	}
	
	private List < Person > getPeople(){
		List < Person > people = new ArrayList < Person > ();
		people.add( new Person( "Jon" , 23 ) );
		people.add( new Person( "Mikel" , 30 ) );
		people.add( new Person( "Eva" , 43 ) );
		people.add( new Person( "Peter" , 18 ) );
		people.add( new Person( "Diana" , 19 ) );
		return people;
	}
}
