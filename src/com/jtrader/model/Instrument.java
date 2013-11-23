package com.jtrader.model;

public class Instrument {
	
	final private String symbol;
	final private String name;
	
	public Instrument(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
}
