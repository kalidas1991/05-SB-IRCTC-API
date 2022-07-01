package in.com.app.response.binding;

import java.util.Date;

import lombok.Data;

@Data
public class Ticket {
	private String name;
	private String from;
	private String to;
	private Date jDate;
	private Long trainNumber;
	private String ticketNumber;
	private String ticketStatus;
	private double price;

}
