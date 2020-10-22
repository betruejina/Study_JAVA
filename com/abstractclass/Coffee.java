package com.abstractclass;

public class Coffee extends Food {
    public Coffee(){
        this.kind = "쓴 음식";
    }

    @Override
    public void taste() {
        System.out.println("왕 커피 짱맛이네");
    }
}
