package com.bob.workflowmanager.entity;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "NAVIGATION")
public class Navigation extends WorkflowElement{

    private WorkflowElement nextElement;

}
