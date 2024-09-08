package quintaClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada listadob = new ListaDoblementeEnlazada();
        ListaCircularDobEnlazada listaCircular = new ListaCircularDobEnlazada();
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int num = 0;
        int pos = 0;
        System.out.println("Bienvenido, por favor seleccione el tipo de lista a trabajar:");
        System.out.println("1. Lista doblemente enlazada");
        System.out.println("2. Lista doblemente enlazada circular");
        op = scanner.nextInt();
        scanner.nextLine();

        if (op == 1){
            while (true){
                System.out.println("Elije una opción: ");
                System.out.println("1. Insertar un nodo al comienzo");
                System.out.println("2. Insertar un nodo al final");
                System.out.println("3. Borrar un nodo cualquiera");
                System.out.println("4. Mostrar los valores de los nodos");
                System.out.println("5. Mostrar los valores de los nodos en reversa");
                System.out.println("6. Salir");
                op = scanner.nextInt();
                scanner.nextLine();
                switch (op){
                    case 1:
                        System.out.println("Escribe el número del nuevo nodo:");
                        num = scanner.nextInt();
                        scanner.nextLine();
                        listadob.agregarComienzo(num);
                        break;
                    case 2:
                        System.out.println("Escribe el número del nuevo nodo:");
                        num = scanner.nextInt();
                        scanner.nextLine();
                        listadob.agregarFinal(num);
                        break;
                    case 3:
                        System.out.println("Escribe el valor del nodo que quieres borrar:");
                        num = scanner.nextInt();
                        scanner.nextLine();
                        listadob.eliminarNodo(num);
                        break;
                    case 4:
                        listadob.imprimir();
                        break;
                    case 5:
                        listadob.imprimirReversa();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción incorrecta, vuelve a intentar");
                        break;
                }
            }
        } else if (op==2){
            while (true){
                System.out.println("Elije una opción: ");
                System.out.println("1. Insertar un nodo en cualquier posición");
                System.out.println("2. Eliminar un nodo");
                System.out.println("3. Imprimir la lista");
                System.out.println("4. Imprimir la lista tres veces");
                System.out.println("5. Salir");
                op = scanner.nextInt();
                scanner.nextLine();
                switch (op){
                    case 1:
                        System.out.println("Escribe el número del nuevo nodo:");
                        num = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Escribe la posición en la que quieres insertar el nuevo nodo:");
                        pos = scanner.nextInt();
                        scanner.nextLine();
                        listaCircular.insertarNodo(num, pos);
                        break;
                    case 2:
                        System.out.println("Escribe el número del nodo a eliminar:");
                        num = scanner.nextInt();
                        scanner.nextLine();
                        listaCircular.eliminarNodo(num);
                        break;
                    case 3:
                        listaCircular.imprimirNodos();
                        break;
                    case 4:
                        listaCircular.imprimirNodosTres();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción incorrecta, vuelve a intentar");
                        break;
                }
            }
        }

    }
}
