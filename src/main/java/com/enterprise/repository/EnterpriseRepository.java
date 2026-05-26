package com.enterprise.repository;

public class EnterpriseRepository {
    private String componentId;
    
    public EnterpriseRepository() {
        this.componentId = "repository-component-" + System.currentTimeMillis();
    }
    
    public String getComponentId() {
        return this.componentId;
    }
}
