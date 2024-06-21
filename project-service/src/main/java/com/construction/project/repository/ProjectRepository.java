package com.construction.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.construction.project.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
