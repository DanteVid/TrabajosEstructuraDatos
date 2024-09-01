package cuartaClase;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Nodo nuevo;
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int op = 0;
            System.out.println("Por favor elige una opción:");
            System.out.println("1. Añadir un numero al comienzo)");
            System.out.println("2. Imprimir la lista");
            System.out.println("3. Eliminar un numero de la lista");
            System.out.println("4. Buscar un numero en la lista");
            System.out.println("5. Añadir un número a una posición específica");
            System.out.println("6. Salir");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingresa el numero:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    nuevo = new Nodo(num, null);
                    listaEnlazada.insertarComienzo(nuevo);
                    break;
                case 2:
                    System.out.println();
                    listaEnlazada.recorrerEImprimirLista();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingresa el numero que quieres borrar:");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    listaEnlazada.eliminarPorValor(num);
                    break;
                case 4:
                    System.out.println("Ingresa el numero que quieres buscar:");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    listaEnlazada.buscarNodo(num);
                    break;
                case 5:
                    System.out.println("Ingresa el numero que vas a añadir:");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    nuevo = new Nodo(num, null);
                    System.out.println("Ingresa la posicion donde lo vas a añadir:");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    listaEnlazada.anadirNodo(nuevo, pos);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Eligiste una opción incorrecta");
            }
        }

    }
}
