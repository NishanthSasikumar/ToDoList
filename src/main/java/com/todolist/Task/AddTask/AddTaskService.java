package com.todolist.Task.AddTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class AddTaskService {
	
	@Autowired
	AddTaskRepository addTaskRepository;
	
	public void saveTask(Task req,HttpSession session)
	{
		TaskDetails det=new TaskDetails();
		det.setTitle(req.getTitle());
		det.setDescription(req.getDescription());
		det.setPriority(req.getPriority());
		det.setStatus(Status.PENDING);
		det.setDate(req.getDate());
		det.setEmail((String)session.getAttribute("userId"));
		addTaskRepository.save(det);
	}
}
