package com.todolist.Task.AddTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.Task.AddTask.Resources.Task;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Task")
public class AddTaskController {
	
	@Autowired
	AddTaskService addTaskService;
	
	@PostMapping("/AddTask")
	public String addTask(@RequestBody Task task,HttpSession session) {
		addTaskService.saveTask(task,session);
		return "success";
	}
}
