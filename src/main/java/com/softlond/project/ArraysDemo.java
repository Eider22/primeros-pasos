package main.java.com.softlond.project;

public class ArraysDemo {
    
    public static void run(){
        // int[] numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[2] = 2;
        // numeros[3] = 4;
        // numeros[4] = 5;
        
        int[] numeros = {1,2,3,4,5};        
        
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        
        System.out.println(suma);
        
    }
    
    public static void maximo(){
        int[] numeros = {3,4,5,2,1};    
        
        int maximo = numeros[0];

        for (int numero : numeros) {
            if(numero > maximo){
                maximo = numero;
            }
        }

        System.out.println(maximo);
    }
    
}


// package main.java.com.softlond.project;

// public class ArraysDemo {
    
//     public static void run(){
//         int[] numeros = new int[5];
//         numeros[0] = 1;
//         numeros[1] = 2;
//         numeros[2] = 3;
//         numeros[3] = 4;
//         numeros[4] = 5;


//         //int[] numeros = {1,2,3,4,5};

//         int suma = 0;
//         for (int numero : numeros){
//             suma += numero;
//         }

//         System.out.println(suma);



//     }

//   public static void maximo(){
//             int[] numeros = {3,4,5,2,1};

//             int maximo = numeros[0];

//             for (int numero : numeros){
//                 if(numero > maximo){
//                     maximo = numero;
//                 }
//             }

//             System.out.println(maximo);
//         }
// }