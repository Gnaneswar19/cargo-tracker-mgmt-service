package com.tracking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracking.model.TrackingInfo;
import com.tracking.service.TrackerManangmentService;

@RestController
@RequestMapping("/api/tracking-service")
public class TrackerManangementController {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(TrackerManangementController.class);

	@Autowired
	TrackerManangmentService trackerManagementService;

	@PostMapping("")
	public ResponseEntity<TrackingInfo> saveTrakerDetails(@RequestBody TrackingInfo tracking) {
		try {
			log.info("save tracker details");
			return new ResponseEntity<>(trackerManagementService.saveTracingInfo(tracking), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
	 * @PutMapping("/tutorials/{id}") public ResponseEntity<Tutorial>
	 * updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
	 * Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
	 * 
	 * if (tutorialData.isPresent()) { Tutorial _tutorial = tutorialData.get();
	 * _tutorial.setTitle(tutorial.getTitle());
	 * _tutorial.setDescription(tutorial.getDescription());
	 * _tutorial.setPublished(tutorial.isPublished()); return new
	 * ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK); } else {
	 * return new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
	 */

	
}
