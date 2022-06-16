package com.company;

public class Dog extends Animal implements Audible,Walkable{
    SpeakingBehaviour speakingBehaviour;
    WalkingBehaviour walkingBehaviour;
    Dog(SpeakingBehaviour speakingBehaviour){
        this.speakingBehaviour = speakingBehaviour;
    }
    Dog(WalkingBehaviour walkingBehaviour){
        this.walkingBehaviour=walkingBehaviour;
    }
    @Override
    public void makeSound() {
        System.out.println("Dog make sound");
        speakingBehaviour.makeSound();
    }

    @Override
    public void walk() {
        System.out.println("Dog walk");
        walkingBehaviour.walk();
    }
}
