package com.analytics.model;

import org.springframework.stereotype.Component;

@Component
public class PageVisitsModel {
	private String month;
	private int pageVisits;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getPageVisits() {
		return pageVisits;
	}
	public void setPageVisits(int pageVisits) {
		this.pageVisits = pageVisits;
	}
	
	
}
