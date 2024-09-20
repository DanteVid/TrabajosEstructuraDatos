package sextaClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expresion = "";
        Pila pila = new Pila();
        int i = 0; int op = 0;
        char a;

        System.out.println("Elige una opción:");
        System.out.println("1. Verificar paréntesis");
        System.out.println("2. Invertir una oración");
        op = scanner.nextInt();
        scanner.nextLine();

        if (op ==1){
            System.out.println("Por favor ingresa una expresión matemática con paréntesis");
            expresion = scanner.nextLine();

            while (i<expresion.length()){
                a=expresion.charAt(i);
                if (a == '('){
                    pila.push(a);
                }else if (a == ')'){
                    pila.pop();
                }
                i++;
            }

            if (pila.getTop()!=null ){
                System.out.println("La expresión está mal balanceada");
            }else{
                System.out.println("La expresión está bien balanceada!");
            }

            scanner.close();
        } else {
            System.out.println("Por favor ingresa una oración");
            expresion = scanner.nextLine();

            String[] frase = expresion.split(" ");

            for(String palabra : frase){
                pila.push(palabra);
            }

            System.out.println("La palabra en el top de la píla es: " + pila.peek().getData());

            System.out.println("La oración invertida es:");

            while(pila.getTop()!=null){
                System.out.print(pila.getTop().getData()+" ");
                pila.pop();
            }


            scanner.close();
        }


    }
}
