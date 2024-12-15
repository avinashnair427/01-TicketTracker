package com.project.ticketTracker.service;

import java.util.List;

import com.project.ticketTracker.dto.TicketDto;

public interface TicketService {
	
	List<TicketDto> findAllTickets();
	
	List<TicketDto> findTicketByUser();
	
	void createTicket(TicketDto ticketDto);
	
	TicketDto findTickerById(Long ticketId);
	
	
	
	void updateTicket(TicketDto ticketDto);
	
	void deleteTicket(Long ticketId);

	TicketDto findTicketByUrl(String ticketUrl);
	
	List<TicketDto> searchTickets(String query);

}
