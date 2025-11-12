package com.angeldz.todoapp.repositories;

import com.angeldz.todoapp.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository  extends CrudRepository<Task,Long> {

    @Query("SELECT * FROM task")
    List<Task> findAllTasks();

    @Query("SELECT * FROM task WHERE id = :id")
    List<Task> findTasksById(long Id);
}
