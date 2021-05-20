package com.taskmanger.TaskManger.controller;

import com.taskmanger.TaskManger.svc.Task;
import com.taskmanger.TaskManger.svc.TaskManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*http://localhost:8080/swagger-ui.html
* access swagger
* */
@RestController
@RequestMapping("/tasks")
public class TaskManagerController {

    @Autowired
    TaskManagerService svc;

    @GetMapping("{id}")
    public ResponseEntity<Object> getTask(@PathVariable("id") Long id) {
        Task task = svc.getTask(id);
        if (task == null)
            return ResponseEntity.ok("Task not found...");
        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<TaskView> createTask(@RequestBody TaskView task) {
        Task response = svc.createTask(mapTaskViewToTask(task));
        return ResponseEntity.ok(mapTaskEntityToTask(response));
    }

    private static TaskView mapTaskEntityToTask(Task task) {
        TaskView taskView = new TaskView();
        taskView.setId(task.getId());
        taskView.setAssignedTo(task.getAssignedTo());
        taskView.setCompletionTime(task.getCompletionTime());
        taskView.setInitiatorName(task.getInitiatorName());
        taskView.setScheduledTime(task.getScheduledTime());
        taskView.setName(task.getName());

        return taskView;
    }

    private static Task mapTaskViewToTask(TaskView taskView) {
        Task task = new Task();
        task.setAssignedTo(taskView.getAssignedTo());
        task.setCompletionTime(taskView.getCompletionTime());
        task.setInitiatorName(taskView.getInitiatorName());
        task.setScheduledTime(taskView.getScheduledTime());
        task.setName(taskView.getName());

        return task;
    }
}
