package com.analytics.dao;
import java.util.ArrayList;
import java.util.List;

import com.analytics.model.PageVisitsModel;
import org.springframework.stereotype.Component;

@Component
public class AnalyticsDAO {
	
	public List<PageVisitsModel> fetchPageVisits() {
		
		List<PageVisitsModel> result = new ArrayList<>();
		
		PageVisitsModel p1 = new PageVisitsModel();
		p1.setMonth("jan");
		p1.setPageVisits(1000);
		PageVisitsModel p2= new PageVisitsModel();
		p2.setMonth("feb");
		p2.setPageVisits(500);
		PageVisitsModel p3 = new PageVisitsModel();
		p3.setMonth("mar");
		p3.setPageVisits(3000);
		PageVisitsModel p4 = new PageVisitsModel();
		p4.setMonth("apr");
		p4.setPageVisits(2500);
		PageVisitsModel p5 = new PageVisitsModel();
		p5.setMonth("may");
		p5.setPageVisits(900);
		
		result.add(p1);
		result.add(p2);
		result.add(p3);
		result.add(p4);
		result.add(p5);
	
		return result;
		
		
	}

}
