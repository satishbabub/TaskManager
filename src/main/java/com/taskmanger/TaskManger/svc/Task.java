package com.taskmanger.TaskManger.svc;

import com.taskmanger.TaskManger.repository.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "TASK")
public class Task extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TASK_NAME")
    private String name;
    @Column(name = "TASK_INITIATED_BY")
    private String initiatorName;
    @Column(name = "TASK_ASSIGNED_TO")
    private String assignedTo;
    @Column(name = "TASK_STARTED_TIME")
    private OffsetDateTime scheduledTime;
    @Column(name = "TASK_COMPLETED_TIME")
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
