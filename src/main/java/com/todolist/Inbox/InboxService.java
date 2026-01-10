package com.todolist.Inbox;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@Service
public class InboxService {
	
	@Autowired
	InboxRepository inboxRepo;
	
	public List<TaskDetails> getTask(HttpSession session)
	{
		Sort sort=Sort.by(Sort.Direction.ASC,"Date");
		return inboxRepo.findByEmail((String)session.getAttribute("userId"),sort);
	}
}
