package com.yash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entities.Project;
import com.yash.entities.ProjectTask;
import com.yash.payload.ProjectIdException;
import com.yash.payload.ProjectTaskIdException;
import com.yash.payload.ProjectTaskNotFoundException;
import com.yash.repositories.ProjectRepository;
import com.yash.repositories.ProjectTaskRepository;

@Service
public class ProjectTaskService {

	@Autowired
	private ProjectTaskRepository projectTaskRepository;

	@Autowired
	private ProjectRepository projectRepository;

	public Iterable<ProjectTask> findAllTasks(String projectIdentifier) {
		return projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);
	}

	public ProjectTask saveOrUpdateTask(ProjectTask projectTask, String projectIdentifier) {
		if (projectTask.getId() != null) {
			ProjectTask existingProjectTask = projectTaskRepository
					.findByProjectTaskIdentifier(projectTask.getProjectTaskIdentifier());
			if (existingProjectTask != null
					&& (!existingProjectTask.getProjectIdentifier().equals(projectIdentifier))) {
				throw new ProjectTaskNotFoundException("Project Task not found in your project");
			} else if (existingProjectTask == null) {
				throw new ProjectTaskNotFoundException("Project Task with ID: '"
						+ projectTask.getProjectTaskIdentifier() + "' cannot be updated because it doesn't exist");
			}
		}
		try {
			Project project = projectRepository.findByProjectIdentifier(projectIdentifier);
			projectTask.setProject(project);
			;
			projectTask.setProjectIdentifier(project.getProjectIdentifier());
			projectTask.setProjectTaskIdentifier(projectTask.getProjectTaskIdentifier().toUpperCase());
			return projectTaskRepository.save(projectTask);
		} catch (Exception e) {
			throw new ProjectIdException(
					"ProjectTaskID " + projectTask.getProjectTaskIdentifier().toUpperCase() + " already exists");
		}
	}

	public ProjectTask findProjectTaskByIdentifier(String projectId, String taskId) {
		ProjectTask projectTask = projectTaskRepository.findByProjectTaskIdentifier(taskId.toUpperCase());
		if (projectTask == null) {
			throw new ProjectTaskIdException("TaskID " + taskId + " doesn't exists");
		}
		if (!projectTask.getProjectIdentifier().equals(projectId)) {
			throw new ProjectTaskNotFoundException("Task not found in your account");
		}
		return projectTask;
	}

	public void deleteProjectTaskByIdentifier(String projectId, String taskId) {
		projectTaskRepository.delete(findProjectTaskByIdentifier(projectId, taskId));
	}

}
