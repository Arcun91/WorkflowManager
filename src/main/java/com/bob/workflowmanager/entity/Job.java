package com.bob.workflowmanager.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "JOB")
public class Job extends WorkflowElement {

    private String workerName;

}
