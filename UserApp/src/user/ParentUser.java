package user;

import java.util.ArrayList;

import user.ChildUser;

public class ParentUser extends User{

	private String street;
	private String city;
	private String state;
	private int zip;
	
	
	
	public ParentUser(String fname, String lname, String street, String city, String state, int zip) {
		super(fname, lname);
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return super.toString()+"ParentUser [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}
