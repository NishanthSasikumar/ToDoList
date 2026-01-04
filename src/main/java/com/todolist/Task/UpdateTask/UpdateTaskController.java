package com.todolist.Task.UpdateTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.Task.AddTask.Resources.Task;
import jakarta.servlet.http.HttpSession;

@RestController
public class UpdateTaskController {
	
	@Autowired
	UpdatedTaskService updatedTaskSer;
	
	@PostMapping("/UpdateTask")
	public String UpdateTask(@RequestBody Task task,HttpSession session)
	{
		updatedTaskSer.updatedTask(task,session);
		return "Updated Successfully";
	}
}
