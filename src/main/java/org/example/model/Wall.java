package org.example.model;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public void create() {
        System.out.println("Wall has been built.");
    }

    public String getDirection() {
        return direction;
    }
}
