package com.example.demo.Models;

public class Topic{
    private String name;
    private String description;
    public Topic(){
        
    }
    public Topic(String name, String description){
        super();
        this.setName(name);
        this.setDescription(description);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}