package com.todolist.Task.UpdateTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.Task.AddTask.Resources.Status;
import com.todolist.Task.AddTask.Resources.Task;
import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@Service
public class UpdatedTaskService {
	@Autowired
	UpdatedTaskRepository updatedTaskSer;
	
	public void updatedTask(Task task,HttpSession session)
	{
		TaskDetails det=new TaskDetails();
		det.setTitle(task.getTitle());
		det.setDescription(task.getDescription());
		det.setDate(task.getDate());
		det.setPriority(task.getPriority());
		det.setEmail((String)session.getAttribute("userId"));
		det.setStatus(Status.COMPLETED);
		updatedTaskSer.save(det);
	}
	
}
