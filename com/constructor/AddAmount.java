package com.constructor;

public class AddAmount {
    int amount = 500;
    AddAmount(){
        System.out.println("Balance is "+amount);
    }
    AddAmount(int deposit){
        System.out.println("Updated balance is "+(amount+deposit));
    }

    public static void main(String[] args) {
        new AddAmount();
        new AddAmount(500);
    }
}
