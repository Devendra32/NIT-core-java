package com.interfaces;

public interface InterfaceB
{
    void show();

    default void display()
    {
        System.out.println("InterfaceB display()");
    }
}
