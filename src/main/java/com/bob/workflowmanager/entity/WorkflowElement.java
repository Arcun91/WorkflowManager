package com.bob.workflowmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public abstract class WorkflowElement implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    private String type;
    private String code;

}
