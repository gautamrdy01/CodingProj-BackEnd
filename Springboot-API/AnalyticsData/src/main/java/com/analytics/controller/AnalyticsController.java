package com.analytics.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.analytics.model.PageVisitsModel;
import com.analytics.service.AnalyticsService;
@RestController
public class AnalyticsController {
	private AnalyticsService analyticsService;
	
	@GetMapping("analytics/pagevisits")
	public List<PageVisitsModel> pageVisits() {
		List<PageVisitsModel> result = this.analyticsService.generatePageVisits();
		System.out.println(result);
		return null;
		
	}
	
}
