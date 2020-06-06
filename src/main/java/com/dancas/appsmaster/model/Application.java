package com.dancas.appsmaster.model;

public class Application {

    private String name;
    private String description;

    public Application(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Application setName(String name) {
        this.name  = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Application setDescription(String description) {
        this.description = description;
        return this;
    }
}
