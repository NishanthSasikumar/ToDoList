package com.todolist.Competed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.Task.AddTask.Resources.Status;
import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@Service
public class CompletedService {

	@Autowired
	CompletedRepository completedRep;
	public List<TaskDetails> getCompleted(HttpSession session)
	{
		return completedRep.findByEmailAndStatus((String)session.getAttribute("userId"), Status.COMPLETED);
	}
}
