package com.taskmanger.TaskManger.svc;

import com.taskmanger.TaskManger.repository.TaskManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskManagerService {

    @Autowired
    TaskManagerRepository repository;

    public Task getTask(Long id) {
        Optional<Task> task = repository.findById(id);
        if (!task.isPresent())
            return null;
        return task.get();
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }
}
