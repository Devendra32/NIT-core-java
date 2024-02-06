package com.comparator_comparable.comparable;

public class ClassA implements Comparable<ClassA>
{
    private String name;
    private int id;
    private String profile;

    public ClassA(String name, int id, String profile)
    {
        this.name=name;
        this.id=id;
        this.profile=profile;

    }

    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", profile='" + profile + '\'' +
                '}';
    }

    @Override
    public int compareTo(ClassA o) {
//        return this.id-o.id;
        return this.name.compareTo(o.name);
    }
}
