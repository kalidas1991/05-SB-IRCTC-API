package in.com.app.request.binding;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Passenger {

	private String name;
	private String email;
	private String from;
	private String to;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date jDate;
	private Long trainNumber;
	
}
