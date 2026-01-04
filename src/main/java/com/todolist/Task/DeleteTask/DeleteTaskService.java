package com.todolist.Task.DeleteTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class DeleteTaskService {

	@Autowired
	DeleteTaskRepository deleteTaskRep;
	
	public void deleteTask(DeleteFormat del,HttpSession session)
	{
		deleteTaskRep.deleteByIdAndEmail(del.getId(),(String)session.getAttribute("userId"));
	}
}
