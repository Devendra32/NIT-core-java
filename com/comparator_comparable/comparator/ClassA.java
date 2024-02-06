package com.comparator_comparable.comparator;

public class ClassA {
    private String name;
    private int id;
    private String profile;

    public ClassA(String name, int id, String profile) {
        this.name = name;
        this.id = id;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", profile='" + profile + '\'' +
                '}';
    }

}
