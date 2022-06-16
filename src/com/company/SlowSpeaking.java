package com.company;

public class SlowSpeaking implements SpeakingBehaviour{
    @Override
    public void makeSound() {
        System.out.println("slow speak.!");
    }
}
