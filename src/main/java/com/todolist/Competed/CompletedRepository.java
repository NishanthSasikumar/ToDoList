package com.todolist.Competed;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.Task.AddTask.Resources.Status;
import com.todolist.Task.AddTask.Resources.TaskDetails;

@Repository
public interface CompletedRepository extends JpaRepository<TaskDetails,Long> {
	List<TaskDetails> findByEmailAndStatus(String Email,Status status);
}
