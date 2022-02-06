package com.tms.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Ashish
 *
 */
@Entity
@Data
@AllArgsConstructor
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empUserName;
	private String empPassword;
	private String empEmail;
	private String companyName;

	public Employee() {
	}

}
