package com.xworkz.xmlproject;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentInfo {
	
	private int id;
	private String name;
	private String email;
	
	public StudentInfo() {
		System.out.println("Created default"+this.getClass().getName());
	}
	

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public StudentInfo(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
}
