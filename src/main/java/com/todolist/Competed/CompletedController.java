package com.todolist.Competed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@RestController
public class CompletedController {

	@Autowired
	CompletedService completedSer;
	
	@GetMapping("/Completed")
	public List<TaskDetails> getCompletedSer(HttpSession session)
	{
		return completedSer.getCompleted(session);
	}
}
