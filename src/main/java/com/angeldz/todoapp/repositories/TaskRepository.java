package com.angeldz.todoapp.repositories;

import com.angeldz.todoapp.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository  extends CrudRepository<Task,Long> {
}
