package com.todolist.Task.UpdateTask;

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
public class UpdateTaskController {
	
	@Autowired
	UpdatedTaskService updatedTaskSer;
	
	@PostMapping("/UpdateTask")
	public String UpdateTask(@RequestBody Task task,HttpSession session,RedirectAttributes ra)
	{
		updatedTaskSer.updatedTask(task,session);
		ra.addFlashAttribute("Msg","updated successfully");
		return "redirect:/Today";
	}
}
