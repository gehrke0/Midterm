package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StarDate;
	private Date EndDate;

	public Semester() {
	}

	public Semester(UUID semesterID, Date starDate, Date endDate) {
		super();
		SemesterID = semesterID;
		StarDate = starDate;
		EndDate = endDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStarDate() {
		return StarDate;
	}

	public void setStarDate(Date starDate) {
		StarDate = starDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
