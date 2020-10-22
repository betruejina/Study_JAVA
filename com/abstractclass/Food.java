package com.abstractclass;

public abstract class Food { //추상클래스
   public String kind;

   public void eat(){
       System.out.println("음식을 먹습니다.");
   }

    public abstract void taste();
}