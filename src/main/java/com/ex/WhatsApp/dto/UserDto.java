package com.ex.WhatsApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;

	/*
	 * // Getters and Setters
	 *  public String getFirstName() { return firstName; }
	 * 
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setLastName(String lastName) { this.lastName = lastName; }
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 */
}
