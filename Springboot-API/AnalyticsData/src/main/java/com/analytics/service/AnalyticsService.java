package com.analytics.service;
import java.util.List;

import com.analytics.model.PageVisitsModel;

import org.springframework.stereotype.Service;
import com.analytics.dao.AnalyticsDAO;

@Service
public class AnalyticsService {
	private AnalyticsDAO analyticsDAO;
	public List<PageVisitsModel> generatePageVisits() {
		return this.analyticsDAO.fetchPageVisits();
		
	}

}
