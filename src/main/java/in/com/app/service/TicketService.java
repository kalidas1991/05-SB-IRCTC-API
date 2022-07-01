package in.com.app.service;

import in.com.app.request.binding.Passenger;
import in.com.app.response.binding.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicketDetails(String ticketNumber);
}
