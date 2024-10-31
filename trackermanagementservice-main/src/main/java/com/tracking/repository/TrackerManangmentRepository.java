package com.tracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracking.model.TrackingInfo;

public interface TrackerManangmentRepository extends JpaRepository<TrackingInfo, Long> {
	
}
