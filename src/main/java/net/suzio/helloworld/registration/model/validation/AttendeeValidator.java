package net.suzio.helloworld.registration.model.validation;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.suzio.helloworld.registration.model.Attendee;

@Component("beforeCreateAttendeeValidator")
public class AttendeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Attendee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Attendee attendee = (Attendee) target;
		if (StringUtils.isEmpty(attendee.getFirstName())) {
			errors.rejectValue("firstname", "firstname.empty");
		}

		if (StringUtils.isEmpty(attendee.getLastName())) {
			errors.rejectValue("lastname", "lastname.empty");
		}

		if (StringUtils.isEmpty(attendee.getAddress())) {
			errors.rejectValue("address", "address.empty");
		}

		if (null == attendee.getState()) {
			errors.rejectValue("state", "state.empty");
		}

		if (null == attendee.getCountry()) {
			errors.rejectValue("country", "country.empty");
		}

		String zipCode = attendee.getZipCode();
		if (null == zipCode) {
			errors.rejectValue("zipcode", "zip.empty");
		} else if (!(zipCode.matches("\\d{5}+"))) {
			errors.rejectValue("zipcode", "zip.format");
		}

		String zip4 = attendee.getZipPlusFour();
		if (null != zip4 && !(zip4.matches("\\d{4}+"))) {
			errors.rejectValue("zip4", "zip4.format");
		}
	}

}
