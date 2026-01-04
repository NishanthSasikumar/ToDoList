package com.todolist.Today;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@RestController
public class TodayController {
	
	@Autowired
	TodayService todaySer;
	
	@GetMapping("/Today")
	public List<TaskDetails> getTodayTask(HttpSession session)
	{
		return todaySer.getToday(session);
	}
	
}
