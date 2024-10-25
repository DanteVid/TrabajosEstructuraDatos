package segundaClase;

import java.util.Scanner;

public class Main {

    public static int calcularFibonacciFor(int n){

        if (n==1) return 0;
        if (n==2) return 1;

        int numero1 = 0;
        int numero2 = 1;
        int fibonacci = 0;

        for (int i = 2; i < n; i++) {
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
        }

        return fibonacci;
    }

    public static int calcularFibonacciOptimizado(int n){

        if (n==1) return 0;
        if (n==2) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static long measureAverageTime(Runnable algorithm, int repetitions) {
        long totalTime = 0;
        for (int i = 0; i < repetitions; i++) {
            long startTime = System.nanoTime();
            algorithm.run();
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / repetitions;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el n del número de Fibonacci que quieres calcular:");
        int n = scanner.nextInt();
        System.out.println("El " + n + " número de fibonacci es: " + calcularFibonacciFor(n));


    }
}
