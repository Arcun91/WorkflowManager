package com.bob.workflowmanager.logic.job;

import com.bob.workflowmanager.entity.Job;
import com.bob.workflowmanager.logic.ExecutableJobHandler;
import org.springframework.stereotype.Component;

@Component
public class TestJob implements ExecutableJobHandler {

    @Override
    public void execute(Job job) {
        System.out.println("TestJob executed");
    }
}
