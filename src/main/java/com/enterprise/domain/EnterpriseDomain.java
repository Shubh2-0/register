package com.enterprise.domain;

public class EnterpriseDomain {
    private String componentId;
    
    public EnterpriseDomain() {
        this.componentId = "domain-component-" + System.currentTimeMillis();
    }
    
    public String getComponentId() {
        return this.componentId;
    }
}
