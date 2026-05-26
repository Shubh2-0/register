package com.enterprise.controller;

public class EnterpriseController {
    private String componentId;
    
    public EnterpriseController() {
        this.componentId = "controller-component-" + System.currentTimeMillis();
    }
    
    public String getComponentId() {
        return this.componentId;
    }
}
