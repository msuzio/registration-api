package net.suzio.helloword.registration.model;

public class Attendee {
	private String firstName;
	private String lastName;
	private String address;
	private State state;
	private Country country;
	private ZipCode zip;
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
	public ZipCode getZip() {
		return zip;
	}
	public void setZip(ZipCode zip) {
		this.zip = zip;
	}
	
	
	

}
