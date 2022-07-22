package com.yash.payload;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	// on exception in creating user UsernameAlreadyExistsResponse is sent
	@ExceptionHandler
	public final ResponseEntity<Object> handleUsernameAlreadyExists(UsernameAlreadyExistsException ex,
			WebRequest request) {
		UsernameAlreadyExistsResponse exceptionResponse = new UsernameAlreadyExistsResponse(ex.getMessage());
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	// on exception in finding project ProjectNotFoundResponse is sent
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectNotFoundException(ProjectNotFoundException ex,
			WebRequest request) {
		ProjectNotFoundResponse exceptionResponse = new ProjectNotFoundResponse(ex.getMessage());
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	// on exception in finding projectid ProjectIdNotFoundResponse is sent
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectIdException(ProjectIdException ex, WebRequest request) {
		ProjectIdResponse exceptionResponse = new ProjectIdResponse(ex.getMessage());
		return new ResponseEntity(exceptionResponse, HttpStatus.CREATED);
	}

	// on exception in finding projectTask ProjectTaskNotFoundResponse is sent
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectTaskNotFoundException(ProjectTaskNotFoundException ex,
			WebRequest request) {
		ProjectTaskNotFoundResponse exceptionResponse = new ProjectTaskNotFoundResponse(ex.getMessage());
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	// on exception in finding projectid ProjectTaskIdNotFoundResponse is sent
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectTaskIdException(ProjectTaskIdException ex, WebRequest request) {
		ProjectTaskIdResponse exceptionResponse = new ProjectTaskIdResponse(ex.getMessage());
		return new ResponseEntity(exceptionResponse, HttpStatus.CREATED);
	}

}
