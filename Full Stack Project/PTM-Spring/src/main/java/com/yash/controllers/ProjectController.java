package com.yash.controllers;

import java.security.Principal;

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

import com.yash.entities.Project;
import com.yash.services.MapValidationErrorService;
import com.yash.services.ProjectService;

@RestController
@RequestMapping("/api/project")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	// takes the username as parameter
	// return all the project based on username
	@GetMapping("/all")
	public Iterable<Project> getAllProjects(Principal principal) {
		logger.info("Inside getAllProject()");
		return projectService.findAllProjects(principal.getName());
	}

	// takes the projectId and username as parameter
	// return project based on projectId with 200 ok status code
	@GetMapping("/{projectId}")
	public ResponseEntity<?> getProjectById(@PathVariable String projectId, Principal principal) {
		logger.info("Inside getProjectById()");
		Project project = projectService.findProjectByIdentifier(projectId, principal.getName());
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}

	// takes the project object and username as parameter
	// return the created project with 200 ok status code
	@PostMapping
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result,
			Principal principal) {
		logger.info("Inside createNewProject()");
		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
		if (errorMap != null) {
			logger.error("Error" + errorMap);
			return errorMap;
		}
		Project newProject = projectService.saveOrUpdateProject(project, principal.getName());
		return new ResponseEntity<Project>(newProject, HttpStatus.CREATED);
	}

	// take the projectId and username as parameter
	// return the Id of the project deleted with 200ok status code
	@DeleteMapping("/{projectId}")
	public ResponseEntity<?> deleteProject(@PathVariable String projectId, Principal principal) {
		logger.info("Inside deleteProject()");
		projectService.deleteProjectByIdentifier(projectId, principal.getName());
		return new ResponseEntity<String>("Project with ID " + projectId + " deleted", HttpStatus.OK);
	}

}
