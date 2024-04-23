package com.ilyazhironkin.birds;

public class Bird {
    private String name;
    private String description;

    public Bird(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
