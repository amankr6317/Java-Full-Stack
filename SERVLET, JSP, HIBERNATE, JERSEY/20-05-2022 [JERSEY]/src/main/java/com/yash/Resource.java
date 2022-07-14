package com.yash;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Resource {

	private String name;

	private int marks;

	public Resource() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}