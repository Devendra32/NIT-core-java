package com.innerclasses.anonymous;

public class ClassA {
    // anonymous class used for overriding
    OuterClass out = new OuterClass() {
        @Override
        public void print() {
            System.out.println("print meth called in classA");
//            super.print();
        }
    };

    ClassA() {
        out.print();
    }

    public static void main(String[] args) {
        new ClassA();
        OuterClass out1= new OuterClass(){
            @Override
            public void print() {
                System.out.println("anonymous print");
                super.print();
            }
        };
        out1.print();
    }
}
