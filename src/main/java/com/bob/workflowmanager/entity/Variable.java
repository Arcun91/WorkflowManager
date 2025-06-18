package com.bob.workflowmanager.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "VARIABLE")
public class Variable extends WorkflowElement{

    private Object value;

}
