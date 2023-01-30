package model;

import java.util.List;

public class Event extends Historical {
	private int startDate;
	private int endDate;
	private String location;
	
	public Event(String name, List<String> ortherName, int startDate, int endDate, String location) {
		super(name, ortherName);
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
	}
	
	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getEndDate() {
		return endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
