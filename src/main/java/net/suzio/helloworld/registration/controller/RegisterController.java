package net.suzio.helloworld.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.suzio.helloworld.registration.model.Attendee;
import net.suzio.helloworld.registration.model.Country;
import net.suzio.helloworld.registration.model.State;
import net.suzio.helloworld.registration.repository.AttendeeRepository;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
	
	@Autowired 
	private AttendeeRepository attendeeRepository;
	@RequestMapping(value = "/attendees", method = RequestMethod.GET)
	public List<Attendee> findAll() {
		List<Attendee> allAttendees = new ArrayList<>();
		// TODO can't coerce this to just be a List without defining a custom query method?
		Iterable<Attendee> found = attendeeRepository.findAll();
		if (null != found) {
			for (Attendee attendee : found) {
				allAttendees.add(attendee);
			}
		}
		return allAttendees;

	}

	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public State[] findAllStates() {
		return State.values();
	}

	@ResponseBody
	@PostMapping("/attendee")
	public Attendee saveAttendee(@RequestBody Attendee attendee) {
		return attendeeRepository.save(attendee.generateUUID());
	}
}
