package com.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracking.model.TrackingInfo;
import com.tracking.repository.TrackerManangmentRepository;

@Service("trackerManagementService")
public class TrackerManangmentService {
	
	@Autowired
	TrackerManangmentRepository trackerManangmentRepository;

	public TrackingInfo saveTracingInfo(TrackingInfo trackingInfo) {
		return trackerManangmentRepository.save(trackingInfo);
	}
}
