package main.java.com.softlond.project;

import java.util.LinkedList;
import java.util.Queue;

public class ColasDemo {

    public static void run() {
        Queue<Integer> cola = new LinkedList<>();

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);


        System.out.println(cola);
        
        System.out.println(cola.poll());
        // cola.poll();
        System.out.println(cola);
        
        System.out.println(cola.poll());
        
        System.out.println(cola);
    }
    
}
