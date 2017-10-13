package net.suzio.helloworld.registration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/attendees")
public class AttendeeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String test() {
		return "TEST";
	}
}
