package com.example.RetoActuatorMicrometers.Entity;

public class Client {
	
	private String name;
	private String surName;
	private String status;
	
	public Client(String name, String surName, String status) {
		super();
		this.name = name;
		this.surName = surName;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
