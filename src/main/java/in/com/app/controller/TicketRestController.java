package in.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.com.app.request.binding.Passenger;
import in.com.app.response.binding.Ticket;
import in.com.app.service.TicketService;

@RestController
public class TicketRestController {
	@Autowired
	TicketService ticketService;

	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = ticketService.bookTicket(passenger);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{ticketNumber}", produces = { "application/json" })
	public ResponseEntity<Ticket> getTicketDetails(@PathVariable String ticketNumber) {
		Ticket ticket = ticketService.getTicketDetails(ticketNumber);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);

	}

}
