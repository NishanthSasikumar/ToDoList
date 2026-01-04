package com.todolist.Task.DeleteTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
public class DeleteTaskController {
	
	@Autowired
	DeleteTaskService delTaskSer;
	@deleteMapping()
	public void delTask(@RequestBody DeleteFormat delTask,HttpSession session)
	{
		delTaskSer.deleteTask(delTask, session);
	}
}
