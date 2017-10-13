package net.suzio.helloworld.registration.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.suzio.helloword.registration.model.Attendee;
import net.suzio.helloword.registration.model.Country;
import net.suzio.helloword.registration.model.State;

@RestController
@RequestMapping(value="/register")
public class RegisterController {
	@RequestMapping(value="/attendees", method=RequestMethod.GET)
	public List<Attendee> findAll() {
		List<Attendee> attendees = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			Attendee a = new Attendee();
			char init = (char)(65+i);
			a.setFirstName(String.valueOf(init));
			a.setLastName(String.valueOf(init++));
			a.setAddress(i + " Street");
			a.setState(State.values()[i]);
			a.setCountry(Country.US);
			attendees.add(a);
		}
		return attendees;

	}
	
	@RequestMapping(value="/states", method=RequestMethod.GET)
	public State[] findAllStates() {
	return State.values();
	}
}
