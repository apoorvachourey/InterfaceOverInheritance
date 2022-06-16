package com.company;

public class SlowWalkingBehaviour implements WalkingBehaviour{
    @Override
    public void walk() {
        System.out.println("slow walking.!");
    }
}
