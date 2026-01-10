package com.todolist.Today;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.Task.AddTask.Resources.TaskDetails;

import jakarta.servlet.http.HttpSession;

@Service
public class TodayService {

	@Autowired
	TodayRepository todayRep;
	
	public List<TaskDetails> getToday(HttpSession session)
	{
		return todayRep.findByEmailAndDate((String)session.getAttribute("userId"), LocalDate.now());
	}
}
