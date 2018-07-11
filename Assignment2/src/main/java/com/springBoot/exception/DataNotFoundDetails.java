package com.springBoot.exception;

import java.util.Date;

public class DataNotFoundDetails {
	private Date date;
	private String message;

	public DataNotFoundDetails(Date date, String message) {
		super();
		this.date = date;
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

}
