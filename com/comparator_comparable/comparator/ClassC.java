package com.comparator_comparable.comparator;

import java.util.Comparator;

public class ClassC implements Comparator<ClassA>
{

    @Override
    public int compare(ClassA o1, ClassA o2) {
//        return o1.getId()-o2.getId();
        return o1.getName().compareTo(o2.getName());
    }

}
