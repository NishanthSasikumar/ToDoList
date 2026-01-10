package com.todolist.Inbox;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.Task.AddTask.Resources.TaskDetails;

@Repository
public interface InboxRepository extends JpaRepository<TaskDetails,Long>{
	List<TaskDetails> findByEmail(String Email,Sort sort);
}
