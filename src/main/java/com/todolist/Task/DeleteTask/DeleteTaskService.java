package com.todolist.Task.DeleteTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpSession;

@Service
public class DeleteTaskService {

	@Autowired
	DeleteTaskRepository deleteTaskRep;
	
	@Transactional
	public void deleteTask(DeleteFormat del,HttpSession session)
	{
		deleteTaskRep.deleteByIdAndEmail(del.getId(),(String)session.getAttribute("userId"));
		String email = (String) session.getAttribute("userId");

		System.out.println("Delete ID = " + del.getId());
		System.out.println("Session email = [" + email + "]");

	}
}
