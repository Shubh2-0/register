package com.enterprise.service;

public class EnterpriseService {
    private String componentId;
    
    public EnterpriseService() {
        this.componentId = "service-component-" + System.currentTimeMillis();
    }
    
    public String getComponentId() {
        return this.componentId;
    }
}
