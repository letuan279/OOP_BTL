package model;

import java.util.List;

public class HistoricSite extends Historical {
	private String location;
	private int builtIn; // year
	
	public HistoricSite(String name, List<String> ortherName, String location, int builtIn) {
		super(name, ortherName);
		this.location = location;
		this.builtIn = builtIn;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBuiltInTime() {
		return builtIn;
	}

	public void setBuiltInTime(int builtIn) {
		this.builtIn = builtIn;
	}
}
