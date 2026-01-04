package com.todolist.Task.UpdateTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.Task.AddTask.Resources.TaskDetails;

@Repository
public interface UpdatedTaskRepository extends JpaRepository<TaskDetails,Long>{
	
	
	
}
