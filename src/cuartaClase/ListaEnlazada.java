package cuartaClase;

import java.util.Scanner;

public class ListaEnlazada {
    private Nodo cab;
    Scanner scanner = new Scanner(System.in);

    public void insertarComienzo(Nodo nuevo){
        if (cab != null) {
            nuevo.setSgte(cab);
        }
        cab = nuevo;
    }

    public void recorrerEImprimirLista(){
        if (cab ==null){
            System.out.println("¡La lista está vacía!");
        }else{
            Nodo rec = cab;
            while(rec != null){
                System.out.println(rec);
                rec = rec.getSgte();
            }
        }
    }

    public void eliminarPorValor(int num){
        if(cab == null){
            System.out.println("La lista está vacía");
        }else if (cab.getSgte()==null){
            if(cab.getNumero() == num){
                cab = null;
            }else {
                System.out.println("Nodo no encontrado");
            }
        }else{
            Nodo ant = cab;
            Nodo rec = cab.getSgte();
            while (rec != null){
                if(rec.getNumero()==num){
                    ant.setSgte(rec.getSgte());
                    break;
                }
                ant = rec;
                rec = rec.getSgte();
            }
        }
    }

    public void buscarNodo(int num){
        if (cab ==null){
            System.out.println("¡La lista está vacía!");
        }else{
            Nodo rec = cab;
            while(rec != null){
                if(rec.getNumero()==num){
                    System.out.println("El valor se encuentra en la lista");
                    return;
                }
                rec = rec.getSgte();
            }
            System.out.println("El valor no se encuentra en la lista");
        }
    }

    public void añadirNodo(Nodo nuevo){
        System.out.println("Por favor ingresa la posición donde quieres poner tu nodo (se cuenta desde 1)");
        int pos = scanner.nextInt();
        scanner.nextLine();
        if (pos == 1){
            if (cab != null) {
                nuevo.setSgte(cab);
            }
            cab = nuevo;
        }

    }
}
