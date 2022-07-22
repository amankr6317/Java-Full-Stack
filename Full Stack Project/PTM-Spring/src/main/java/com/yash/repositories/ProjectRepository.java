package com.yash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	Iterable<Project> findAllByProjectLeader(String username);

	Project findByProjectIdentifier(String projectId);

}
