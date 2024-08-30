package segundaClase;

import java.util.Scanner;

public class Main {

    public static int calcularFibonacciFor(int n){
        if (n==1) return 0;
        if (n==2) return 1;

        int numero1 = 0;
        int numero2 = 1;
        int fibonacci = 0;
        for (int i = 2; i<n; i++){
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
        }
        return fibonacci;
    }

    public static int calcularFibonacciOptimizado(int n){
        if(n==1){
            return 0;
        }
        else if((n==2)||(n==3)){
            return 1;
        }
        else {
            return calcularFibonacciOptimizado(n-1)+ calcularFibonacciOptimizado(n-2);
        }
    }

    public static long medirTiempoPromedio(Runnable metodo, int rep) {
        long tiempoAcumulado =0;
        for(int i =0; i<rep; i++){
            long tiempoInicio = System.nanoTime();
            metodo.run();
            long tiempoFinal = System.nanoTime();
            tiempoAcumulado += (tiempoFinal-tiempoInicio);
        }
        return (tiempoAcumulado/rep);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el n del número de Fibonacci que quieres calcular:");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa el numero de veces que quieres que se repita el algoritmo, entre más sean más preciso será el tiempo promedio:");
        int rep = scanner.nextInt();
        scanner.nextLine();
        System.out.println("El " + n + " número de Fibonacci es: " + calcularFibonacciOptimizado(n));
        long tiempoPromedioFor = medirTiempoPromedio(()->calcularFibonacciFor(n), rep);
        System.out.println("Tiempo promedio con el método que usa for: " + (tiempoPromedioFor));
        long tiempoPromedioRecursividad = medirTiempoPromedio(()->calcularFibonacciOptimizado(n), rep);
        System.out.println("Tiempo promedio con el método que usa recursividad: " + (tiempoPromedioRecursividad));
    }
}

//Para valores pequeños, el método que usa recursividad es más rápido que el del for;
//sin embargo, a partir del 7 número de Fibonacci esto cambia y el método de recursividad
//incrementa su tiempo de carga promedio mucho más que el del for, lo que indica
//una mayor complejidad. El for tiene complejidad O(n), y para que el de recursividad
//aumente tan vertiginosamente, podría ser que tiene una complejidad O(n log(n)), cuya curva
//sea menor que la del for en los valores iniciales. Se puede deducir que esta complejidad
//incrementada es el resultado de que la función tenga que llamarse a sí misma una y otra y otra
//vez creando varios bucles, a diferencia del for donde el cálculo se hace en un solo loop.