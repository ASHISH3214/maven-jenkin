package com.tms.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Ashish
 *
 */
@Entity
@Table(name = "trainer", uniqueConstraints = @UniqueConstraint(columnNames = { "username", "trEmail", "trMb" }))
@Data
@AllArgsConstructor
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trId;
	private String trName;
	private String trEmail;
	private String username;
	private String password;
	private String trMb;
	private String trDob;

	public Trainer() {

	};

}