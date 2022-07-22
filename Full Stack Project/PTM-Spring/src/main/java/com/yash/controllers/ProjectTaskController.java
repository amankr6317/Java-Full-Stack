package com.yash.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entities.ProjectTask;
import com.yash.services.MapValidationErrorService;
import com.yash.services.ProjectTaskService;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = " * ", allowedHeaders = " * ")
public class ProjectTaskController {

	@Autowired
	private ProjectTaskService projectTaskService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	private static final Logger logger = LoggerFactory.getLogger(ProjectTaskService.class);

	// takes the projectId as parameter
	// return all the tasks based on projectId
	@GetMapping("/all/{projectIdentifier}")
	public Iterable<ProjectTask> getAllProjectTasks(@PathVariable String projectIdentifier) {
		logger.info("Inside getAllProjectTasks()");
		return projectTaskService.findAllTasks(projectIdentifier);
	}

	// takes the projectId, taskId as parameter
	// return task based on projectId and taskId
	@GetMapping("/{projectIdentifier}/{projectTaskIdentifier}")
	public ResponseEntity<?> getProjectTaskById(@PathVariable String projectIdentifier,
			@PathVariable String projectTaskIdentifier) {
		logger.info("Inside getProjectTaskById()");
		ProjectTask projectTask = projectTaskService.findProjectTaskByIdentifier(projectIdentifier,
				projectTaskIdentifier);
		return new ResponseEntity<ProjectTask>(projectTask, HttpStatus.OK);
	}

	// takes the projectTask object and projectId as parameter
	// return the created prokectTask with 200ok status code
	@PostMapping("/{projectIdentifier}")
	public ResponseEntity<?> createProjectTask(@Valid @RequestBody ProjectTask projectTask, BindingResult result,
			@PathVariable String projectIdentifier) {
		logger.info("Inside createProjectTask()");
		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
		if (errorMap != null) {
			logger.error("Error " + errorMap);
			return errorMap;
		}
		ProjectTask newProjectTask = projectTaskService.saveOrUpdateTask(projectTask, projectIdentifier);
		return new ResponseEntity<ProjectTask>(newProjectTask, HttpStatus.CREATED);
	}

	// take the projectTask object and projectId as parameter
	// return the Id of the task deleted with 200ok status code
	@DeleteMapping("/{projectId}/{taskId}")
	public ResponseEntity<?> deleteProjectTask(@PathVariable String projectId, @PathVariable String taskId) {
		logger.info("Inside deleteProjectTask()");
		projectTaskService.deleteProjectTaskByIdentifier(projectId, taskId);
		return new ResponseEntity<String>("Task with ID " + taskId + " deleted", HttpStatus.OK);
	}

}
