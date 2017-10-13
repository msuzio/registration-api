package net.suzio.helloword.registration.model;

public class ZipCode {

	private String zip;
	private String plusFour = "";
	public ZipCode(String zip, String plusFour) {
		super();
		this.zip = zip;
		if (null != plusFour) {
			this.plusFour = plusFour;
		}
	}

}
