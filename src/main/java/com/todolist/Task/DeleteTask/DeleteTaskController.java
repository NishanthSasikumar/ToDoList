package com.todolist.Task.DeleteTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Task")
public class DeleteTaskController {

	@Autowired
	DeleteTaskService delTaskSer;

	@PostMapping("/delete")
	public String delTask(@RequestBody DeleteFormat delTask, HttpSession session, RedirectAttributes ra) {
		delTaskSer.deleteTask(delTask, session);
		ra.addFlashAttribute("Msg", "successfully deleted");
		return "redirect:/Today";
	}
}
