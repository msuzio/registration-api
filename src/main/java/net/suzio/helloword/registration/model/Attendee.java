package net.suzio.helloword.registration.model;

public class Attendee {
	private String firstName;
	private String lastName;
	private String address;
	private String address2;
	private State state;
	private Country country;
	private String zipCode;
	private String zipPlusFour;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getZipPlusFour() {
		return zipPlusFour;
	}
	public void setZipPlusFour(String zipPlusFour) {
		this.zipPlusFour = zipPlusFour;
	}
}
