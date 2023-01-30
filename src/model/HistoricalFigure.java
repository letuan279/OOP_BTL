package model;

import java.util.List;

public class HistoricalFigure extends Historical {
	private int born;
	private int died;
	private Era livedInEra;
	private List<Event> relateEvent;
	private HistoricalFigure isDescendanceOf;
	private List<HistoricalFigure> isParentOf;
	
	public HistoricalFigure(String name, List<String> ortherName, int born, int died, Era livedInEra,
			List<Event> relateEvent, HistoricalFigure isDescendanceOf, List<HistoricalFigure> isParentOf) {
		super(name, ortherName);
		this.born = born;
		this.died = died;
		this.livedInEra = livedInEra;
		this.relateEvent = relateEvent;
		this.isDescendanceOf = isDescendanceOf;
		this.isParentOf = isParentOf;
	}
	
	public int getBorn() {
		return born;
	}
	public void setBorn(int born) {
		this.born = born;
	}
	public int getDied() {
		return died;
	}
	public void setDied(int died) {
		this.died = died;
	}
	public Era getLivedInEra() {
		return livedInEra;
	}
	public void setLivedInEra(Era livedInEra) {
		this.livedInEra = livedInEra;
	}
	public List<Event> getRelateEvent() {
		return relateEvent;
	}
	public void setRelateEvent(List<Event> relateEvent) {
		this.relateEvent = relateEvent;
	}
	public HistoricalFigure getIsDescendanceOf() {
		return isDescendanceOf;
	}
	public void setIsDescendanceOf(HistoricalFigure isDescendanceOf) {
		this.isDescendanceOf = isDescendanceOf;
	}
	public List<HistoricalFigure> getIsParentOf() {
		return isParentOf;
	}
	public void setIsParentOf(List<HistoricalFigure> isParentOf) {
		this.isParentOf = isParentOf;
	}
}
