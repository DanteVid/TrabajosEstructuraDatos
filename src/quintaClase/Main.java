package quintaClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int data = 0;
        System.out.println("Bienvenido, por favor seleccione el tipo de lista a trabajar:");
        System.out.println("1. Lista doblemente enlazada");
        System.out.println("2. Lista doblemente enlazada circular");
        op = scanner.nextInt();
        scanner.nextLine();

        if (op == 1){
            while (true){
                System.out.println("Elije una opción: ");
                System.out.println("1. Insertar un nodo al comienzo");
                System.out.println("1. Insertar un nodo al final");
                System.out.println("3. Borrar un nodo cualquiera");
                System.out.println("4. Mostrar los valores de los nodos en reversa");
                System.out.println("5. Salir");
                op = scanner.nextInt();
                scanner.nextLine();
                switch (op){
                    case 1:
                        System.out.println("Escribe el número del nuevo nodo:");
                        data = scanner.nextInt();
                        scanner.nextLine();

                }
            }

        }

    }
}
