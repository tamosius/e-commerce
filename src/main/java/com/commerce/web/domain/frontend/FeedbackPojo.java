package com.commerce.web.domain.frontend;

import java.io.Serializable;

/** Since this object might potentially travel across several JVM's
 *	I will implement the 'Serializable' interface
 */
public class FeedbackPojo implements Serializable{
	
	// declare serial ID version with the hardcoded value 1L
	// this technique frequently used to avoid class cast exception when we make changes to the class
	// with this value we are basically saying that, while we want the class to be serializable we guarantee that it always to be valid
	private static final long serialVesionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String feedback;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public static long getSerialvesionuid() {
		return serialVesionUID;
	}
	
	@Override
	public String toString() {
		return "FeedbackPojo [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", feedback="
				+ feedback + "]";
	}
	
	

}
