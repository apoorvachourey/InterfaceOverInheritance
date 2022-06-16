package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat c = new Cat(new FastSpeak());
        Dog d = new Dog(new FastWalkingBehaviour());
        Dog labro = new Dog(new FastSpeak());

        List<Walkable> w = new ArrayList<>();
        w.add(d);

        List<Audible> a = new ArrayList<>();
        a.add(c);
        a.add(labro);

        for(Walkable walk : w){
            walk.walk();
        }
        for(Audible ad : a){
            ad.makeSound();
        }
    }
}
