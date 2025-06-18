package com.bob.workflowmanager.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "WORKFLOW")
public class Workflow extends WorkflowVariableElement{

    //First navigation
    private Navigation navigation;

}
