package com.todolist.Task.AddTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.todolist.Task.AddTask.Resources.Task;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Task")
public class AddTaskController {
	
	@Autowired
	AddTaskService addTaskService;
	
	 @PostMapping(value = "/AddTask",consumes = "application/json")
	public String addTask(@RequestBody Task task,HttpSession session,RedirectAttributes ra) {
		addTaskService.saveTask(task,session);
		ra.addFlashAttribute("Msg","task added successfully");
		return "redirect:/Today";
	}
}
