package com.abstractclass;

public class Cake extends Food {
    public Cake() {
        this.kind = "단 음식";
    }

    @Override
    public void taste(){
        System.out.println("으, 케이크 달아");
    }
}
