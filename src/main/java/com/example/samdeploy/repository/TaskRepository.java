package com.example.samdeploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samdeploy.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
	
}