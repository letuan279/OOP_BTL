package model;

import java.util.List;

public class Era extends Historical {
	private int fromYear;
	private int toYear;
	private Era isPrecededBy;
	private Era isSucceededBy;
	
	public Era(String name, List<String> ortherName, int fromYear, int toYear, Era isPrecededBy, Era isSucceededBy) {
		super(name, ortherName);
		this.fromYear = fromYear;
		this.toYear = toYear;
		this.isPrecededBy = isPrecededBy;
		this.isSucceededBy = isSucceededBy;
	}	

	public int getFromYear() {
		return fromYear;
	}

	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}

	public int getToYear() {
		return toYear;
	}

	public void setToYear(int toYear) {
		this.toYear = toYear;
	}

	public Era getIsPrecededBy() {
		return isPrecededBy;
	}

	public void setIsPrecededBy(Era isPrecededBy) {
		this.isPrecededBy = isPrecededBy;
	}

	public Era getIsSucceededBy() {
		return isSucceededBy;
	}

	public void setIsSucceededBy(Era isSucceededBy) {
		this.isSucceededBy = isSucceededBy;
	}
}
