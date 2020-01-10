package com.taskmanger.TaskManger.repository;

import com.taskmanger.TaskManger.svc.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskManagerRepository extends JpaRepository<Task, Long> {
}
