package sextaClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expresion = "";
        Pila pila = new Pila();
        int i = 0;
        char a;

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
    }
}
