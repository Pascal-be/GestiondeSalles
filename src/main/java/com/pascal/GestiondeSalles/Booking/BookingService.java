package com.pascal.GestiondeSalles.Booking;

import com.pascal.GestiondeSalles.Client.ClientModel;
import com.pascal.GestiondeSalles.Client.ClientRepository;
import com.pascal.GestiondeSalles.SportHall.SportHallModel;
import com.pascal.GestiondeSalles.SportHall.SportHallRepository;
import org.springframework.stereotype.Service;


@Service
public class BookingService {

private BookingRepository bookingRepository;
private ClientRepository clientRepository;
private SportHallRepository sportHallRepository;


public BookingService(BookingRepository bookingRepository, ClientRepository clientRepository,
		SportHallRepository sportHallRepository) {
	this.bookingRepository = bookingRepository;
	this.clientRepository = clientRepository;
	this.sportHallRepository = sportHallRepository;
}

public BookingDto create(BookingDto bookingDto) {
	
	BookingModel bookingModel = new BookingModel();
	
	bookingModel.setEnd(bookingDto.getEnd());
	bookingModel.setStart(bookingDto.getStart());
	Long numid=bookingDto.getClientId();
	ClientModel clientModel = clientRepository.getOne(numid);
	bookingModel.setClientModel(clientModel);
	SportHallModel sportHallModel = sportHallRepository.getOne(bookingDto.getSportId());
	bookingModel.setSportHallModel(sportHallModel);
	
	//on sauvegarde
	BookingModel save = bookingRepository.save(bookingModel);
	
	//on récupére l'ID  généré 
	bookingDto.setId(save.getId());
	
	return bookingDto;
	
	
	
}




}
