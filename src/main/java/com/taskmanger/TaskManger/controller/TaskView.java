package com.taskmanger.TaskManger.controller;

import java.time.OffsetDateTime;

public class TaskView {

    private Long id;
    private String name;
    private String initiatorName;
    private String assignedTo;
    private OffsetDateTime scheduledTime;
    private OffsetDateTime completionTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public OffsetDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(OffsetDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public OffsetDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(OffsetDateTime completionTime) {
        this.completionTime = completionTime;
    }
}
