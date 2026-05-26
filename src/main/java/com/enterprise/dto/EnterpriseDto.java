package com.enterprise.dto;

public class EnterpriseDto {
    private String componentId;
    
    public EnterpriseDto() {
        this.componentId = "dto-component-" + System.currentTimeMillis();
    }
    
    public String getComponentId() {
        return this.componentId;
    }
}
