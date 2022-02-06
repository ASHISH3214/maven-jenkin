package com.tms.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author Ashish
 *
 */

@Entity
@Table
@Data
public class Toc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int crsId;
	private String crsName;
	private String crsPrerequisites;
	private String crsObjective;
	private String crsOutcomes;
	private String crsDuration;
	private String crsTarget;
	private String crssoftwareReq;
	private String crstopics;
	private String crspostReading;

	public Toc() {

	};

	

}
