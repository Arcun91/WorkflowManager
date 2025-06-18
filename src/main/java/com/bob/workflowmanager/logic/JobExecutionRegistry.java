package com.bob.workflowmanager.logic;

import com.bob.workflowmanager.entity.Job;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JobExecutionRegistry {

    private final Map<String, ExecutableJobHandler> handlerMap;

    public JobExecutionRegistry(Map<String, ExecutableJobHandler> handlerBeans) {
        this.handlerMap = new HashMap<>(handlerBeans);
    }

    public void execute(Job job) {
        ExecutableJobHandler handler = handlerMap.get(job.getCode());
        if (handler == null) {
            throw new IllegalStateException("No handler found for code: " + job.getCode());
        }
        handler.execute(job);
    }
}