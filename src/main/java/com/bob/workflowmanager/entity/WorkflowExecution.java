package com.bob.workflowmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "WORKFLOW_EXECUTION")
public class WorkflowExecution {
    @Id
    private Long id;

    private Navigation navigation;

    private Object currentPosition;

}
