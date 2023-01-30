package model;

import java.util.List;

public class Historical {
	private String name;
	private List<String> ortherName;
	
	public Historical(String name, List<String> ortherName) {
		this.name = name;
		this.ortherName = ortherName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getOrtherName() {
		return ortherName;
	}
	public void setOrtherName(List<String> ortherName) {
		this.ortherName = ortherName;
	}
}
