package com.bob.workflowmanager.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class WorkflowVariableElement extends WorkflowElement{

    private List<Variable> variables;

}
