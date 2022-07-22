package com.yash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.entities.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

	Iterable<ProjectTask> findAllByProjectIdentifier(String projectIdentifier);

	ProjectTask findByProjectTaskIdentifier(String projectTaskIdentifier);

}
