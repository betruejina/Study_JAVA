package com.abstractclass;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Coffee coffee = new Coffee();
        cake.taste();
        coffee.taste();
        System.out.println("-----");

        Food food = null;
        food = new Cake();
        food.taste();
        food = new Coffee();
        food.taste();
        System.out.println("-----");

        foodtaste(new Cake());
        foodtaste(new Coffee());
    }

    public static void foodtaste(Food food){
        food.taste();
    }
}

//추상메소드와 오버라이딩