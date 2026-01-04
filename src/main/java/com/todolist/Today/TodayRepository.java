package com.todolist.Today;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.todolist.Task.AddTask.Resources.TaskDetails;

@Repository
public interface TodayRepository extends JpaRepository<TaskDetails,Long> {
	
	List<TaskDetails> FindByEmailAndDate(String Email,LocalDate Date);

}
