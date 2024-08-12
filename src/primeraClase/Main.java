package primeraClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tarea tarea;
        GestorTareas gestorTareas = new GestorTareas();
        Scanner scanner = new Scanner(System.in);
        String descripcionTareaBuscada = "";
        while (true) {
            int op = 0;
            System.out.println("Por favor elige una opción:");
            System.out.println("1. Agregar un nombre/tarea (sólo podrás hacerlo si no está presente en la lista)");
            System.out.println("2. Mostrar todos los nombres o tareas pendientes");
            System.out.println("3. Buscar un nombre/tarea para verificar si está en la lista");
            System.out.println("4. Eliminar un nombre/tarea");
            System.out.println("5. Salir");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingresa la tarea o nombre:");
                    String descripcionTarea = scanner.nextLine();
                    tarea = new Tarea(descripcionTarea, null);
                    gestorTareas.anadirTarea(tarea);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Las tareas pendientes/nombres que hay en la lista son:");
                    gestorTareas.printTareas();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingresa la tarea o nombre que quieres verificar:");
                    descripcionTareaBuscada = scanner.nextLine();
                    if (gestorTareas.buscarTarea(descripcionTareaBuscada)){
                        System.out.println("La tarea/nombre ya se encuentra en la lista");
                    }else {
                        System.out.println("La tarea/nombre no se encuentra en la lista");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingresa la tarea o nombre que quieres borrar:");
                    descripcionTareaBuscada = scanner.nextLine();
                    gestorTareas.eliminarTarea(descripcionTareaBuscada);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Eligiste una opción incorrecta");
            }
        }

    }
}