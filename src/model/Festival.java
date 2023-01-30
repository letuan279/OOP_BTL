package model;

import java.util.List;

public class Festival extends Historical {
	private String date;
	private String location;
	
	public Festival(String name, List<String> ortherName, String date, String location) {
		super(name, ortherName);
		this.date = date;
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
