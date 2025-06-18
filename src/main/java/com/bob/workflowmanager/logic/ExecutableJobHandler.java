package com.bob.workflowmanager.logic;

import com.bob.workflowmanager.entity.Job;

public interface ExecutableJobHandler {
    void execute(Job job);
}
