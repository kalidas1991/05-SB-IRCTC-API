package in.com.app.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Service;
import in.com.app.request.binding.Passenger;
import in.com.app.response.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	private Map<String, Ticket> ticketDetails = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger passenger) {
		String ticketNumber = UUID.randomUUID().toString().replace("-", "");
		Ticket ticketInfo = new Ticket();
		ticketInfo.setTicketNumber(ticketNumber);
		ticketInfo.setTicketStatus("CONFIRMED");
		ticketInfo.setPrice(400.00);
		ticketInfo.setFrom(passenger.getFrom());
		ticketInfo.setTo(passenger.getTo());
		ticketInfo.setName(passenger.getName());
		ticketInfo.setJDate(passenger.getJDate());
		System.out.println(passenger.getJDate());
		ticketInfo.setTrainNumber(passenger.getTrainNumber());
		ticketDetails.put(ticketNumber, ticketInfo);
		return ticketInfo;
	}

	@Override
	public Ticket getTicketDetails(String ticketNumber) {
		if (ticketDetails.containsKey(ticketNumber)) {
			return ticketDetails.get(ticketNumber);
		}
		return null;
	}
}
