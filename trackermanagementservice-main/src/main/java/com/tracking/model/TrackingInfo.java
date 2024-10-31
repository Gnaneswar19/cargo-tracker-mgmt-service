package com.tracking.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TRACKING_INFO")
public class TrackingInfo {

	@Id
	@Column(name = "CARGO_ID")
	private long cargoId;
	@Column(name = "SPEED")
	private long speed;
	@Column(name = "DIRECTION")
	private String direction;
	@Column(name = "COURSE")
	private String course;
	@Column(name = "LONGITUDE")
	private double longitude;
	@Column(name = "LATITUDE")
	private double latitude;
	@Column(name = "ESEAL")
	private String eSeal;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "CREATED_DT", insertable = false, updatable = false)
	private LocalDateTime createdDate;
	@Column(name = "UPDATED_DT", insertable = false, updatable = false)
	private LocalDateTime updatedDate;
	@Column(name = "INSERTED_By")
	private String insertedBy;
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	@Column(name = "VEHICLE_NO")
	private String vehicleNo;
	public long getCargoId() {
		return cargoId;
	}
	public void setCargoId(long cargoId) {
		this.cargoId = cargoId;
	}
	public long getSpeed() {
		return speed;
	}
	public void setSpeed(long speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String geteSeal() {
		return eSeal;
	}
	public void seteSeal(String eSeal) {
		this.eSeal = eSeal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getInsertedBy() {
		return insertedBy;
	}
	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
}
