package com.pascal.GestiondeSalles.Booking;

import java.time.LocalDateTime;


import com.pascal.GestiondeSalles.Client.ClientModel;
import com.pascal.GestiondeSalles.SportHall.SportHallModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.OneToOne;
import javax.persistence.*;


@Builder
@Entity
@Table (name="booking")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BookingModel {
	@Id
	@GeneratedValue
	private Long Id;
	
	@OneToOne
	private SportHallModel sportHallModel;
	
	@OneToOne
	private ClientModel clientModel;
	
	private LocalDateTime start;
	
	@Column(name="endBooking")
	private LocalDateTime end;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public SportHallModel getSportHallModel() {
		return sportHallModel;
	}

	public void setSportHallModel(SportHallModel sportHallModel) {
		this.sportHallModel = sportHallModel;
	}

	public ClientModel getClientModel() {
		return clientModel;
	}

	public void setClientModel(ClientModel clientModel) {
		this.clientModel = clientModel;
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
	
}
