package com.iabdinur.tdd.groupcontroller;

public class Trainee {
    private final String name;
    private final String username;

    public Trainee(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }
}
