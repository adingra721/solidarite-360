package sn.afrik.tech.solidarite_360.auth.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistsException extends RuntimeException {
	private String message;
	
	public EmailAlreadyExistsException(String message) {
		super(message);
	}
}
