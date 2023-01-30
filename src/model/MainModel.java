package model;

import java.util.List;

public class MainModel {
	private final List<HistoricalFigure> HistoricalFigures;
	private final List<Era> Eras;
	private final List<Festival> Festivals;
	private final List<HistoricSite> HistoricSites;
	private final List<Event> Events;
	
	public MainModel() {
		//	read data from json
	}

	public List<HistoricalFigure> getHistoricalFigures() {
		return HistoricalFigures;
	}

	public List<Era> getEras() {
		return Eras;
	}

	public List<Festival> getFestivals() {
		return Festivals;
	}

	public List<HistoricSite> getHistoricSites() {
		return HistoricSites;
	}

	public List<Event> getEvents() {
		return Events;
	}
}
