package user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class User implements Serializable{

	

	private long userID;
	private String fName;
	private String lName;




	public User(String fname, String lname) {
		this.fName = fname;
		this.lName = lname;
		this.userID = UUID.randomUUID().getMostSignificantBits();

	}
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String fname) {
		this.fName = fname;
	}
	public String getLastName() {
		return lName;
	}
	public void setLastName(String lname) {
		this.lName = lname;
	}

	public long getUID() {
		return userID;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", fName=" + fName + ", lName=" + lName + "]";
	}
}
