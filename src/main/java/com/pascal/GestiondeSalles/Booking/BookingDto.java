package com.pascal.GestiondeSalles.Booking;

import java.time.LocalDateTime;

public class BookingDto {

	private Long id;

	private Long clientId;
	private Long sportId;
	private LocalDateTime start;
	private LocalDateTime end;

	public BookingDto(Long clientId, Long sportId, LocalDateTime start, LocalDateTime end) {
		this.clientId = clientId;
		this.sportId = sportId;
		this.start = start;
		this.end = end;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
