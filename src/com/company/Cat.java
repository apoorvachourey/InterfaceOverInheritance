package com.company;

public class Cat extends Animal implements Audible{
    SpeakingBehaviour speakingBehaviour;
    Cat(SpeakingBehaviour speakingBehaviour){
        this.speakingBehaviour = speakingBehaviour;
    }
    @Override
    public void makeSound() {
        System.out.println("cat make sound!");
        speakingBehaviour.makeSound();
    }
}
