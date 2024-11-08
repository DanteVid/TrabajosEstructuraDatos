package taller11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        int op = 0;
        String key, value;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("---||MENU||---");
            System.out.println("1. Agregar una entrada a la tabla hash.");
            System.out.println("2. Buscar una entrada en la tabla hash.");
            System.out.println("3. Salir.");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingresa la key");
                    key = scanner.nextLine();
                    System.out.println("Ingresa el valor");
                    value = scanner.nextLine();
                    hashTable.insert(key, value);
                    break;
                case 2:
                    System.out.println("Ingresa la key");
                    key = scanner.nextLine();
                    System.out.println(hashTable.retrieve(key));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
