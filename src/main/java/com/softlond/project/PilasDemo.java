package main.java.com.softlond.project;

import java.util.Deque;
import java.util.LinkedList;

public class PilasDemo {
    public static void run(){
        Deque<Integer> pila = new LinkedList<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println(pila);
        
        
        System.out.println(pila.pop());
        
        
        System.out.println(pila);

        // animal1.a();
    }
}
