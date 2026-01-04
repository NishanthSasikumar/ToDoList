package com.todolist.Task.DeleteTask;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.Task.AddTask.Resources.TaskDetails;

public interface DeleteTaskRepository extends JpaRepository<TaskDetails,Long>{
	
	void deleteByIdAndEmail(long id,String Email); 
}
