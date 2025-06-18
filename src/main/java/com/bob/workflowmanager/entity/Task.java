package com.bob.workflowmanager.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "TASK")
public class Task extends WorkflowVariableElement{

    private String form;
    private ResolverUsers resolver;

}
