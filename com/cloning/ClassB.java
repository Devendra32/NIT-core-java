package com.cloning;

public class ClassB implements Cloneable
{
    int x;
    int y;

    ClassB show() throws CloneNotSupportedException
    {
        ClassB clone = (ClassB) super.clone();
        return clone;
    }
}
