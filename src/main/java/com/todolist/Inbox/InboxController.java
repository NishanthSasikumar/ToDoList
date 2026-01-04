package com.todolist.Inbox;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@RestController
public class InboxController {

	@Autowired
	InboxService inboxSer;
	
	@GetMapping("/Inbox")
	public List<TaskDetails> getTaskCon(HttpSession session){
		return inboxSer.getTask(session);
	
}
}
