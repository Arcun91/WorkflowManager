package com.bob.workflowmanager.entity;

import lombok.Data;

import java.util.List;

@Data
public class ResolverUsers {

    private String assignee;
    private List<String> groups;

}
