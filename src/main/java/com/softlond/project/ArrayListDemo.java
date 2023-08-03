package main.java.com.softlond.project;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void run(){
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};

        // listaEnteros.add(10);
        // listaEnteros.add(20);
        // listaEnteros.add(30);

        // for (Integer entero : listaEnteros) {
        //     System.out.println(entero);
        // }
        

        // System.out.println(listaEnteros.get(2));
        System.out.println(listaEnteros);
        
        listaEnteros.set(1, 12);
        
        System.out.println(listaEnteros);
        
        listaEnteros.remove(1);
        System.out.println(listaEnteros);
                
    }
    
}
