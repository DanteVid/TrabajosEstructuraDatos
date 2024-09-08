package quintaClase;

import cuartaClase.Nodo;

import java.util.Scanner;

public class ListaCircularDobEnlazada {
    private Nodo cab;
    private Nodo cola;
    Scanner scannertemp = new Scanner(System.in);
    int numTemp = 0;

    public void insertarNodo(int num, int pos) {
        Nodo nuevo = new Nodo(num);

        if (cab == null) {
            System.out.println("¡La lista está vacía! El nodo se guardará como el primero, ¿quiere continuar? (1 si, 2 no)");
            numTemp = scannertemp.nextInt();
                if(numTemp==1){
                    cab = nuevo;
                    cola = nuevo;
                    cab.setSgte(cab);
                    cab.setPrev(cab);
                }else{
                    System.out.println("Abortando...");
                }
        } else {
            Nodo rec = cab;
            int i = 1;

            if (pos == 1) {
                nuevo.setSgte(cab);
                nuevo.setPrev(cola);
                cab.getPrev().setSgte(nuevo);
                cab.setPrev(nuevo);
                cab = nuevo;
            } else {
                while (i < pos - 1) {
                    rec = rec.getSgte();
                    i++;
                    if(rec == cab){
                        System.out.println("La posición está fuera de límites!");
                        return;
                    }
                }

                nuevo.setSgte(rec.getSgte());
                nuevo.setPrev(rec);
                rec.getSgte().setPrev(nuevo);
                rec.setSgte(nuevo);
                if(rec == cola){
                    cola = nuevo;
                }
            }
        }
    }

    public void eliminarNodo(int num) {
        Nodo rec = cab;
        if (cab == null) {System.out.println("¡La lista está vacía!"); return;}
        do {
            if (rec.getNumero() == num) {
                if (rec == cab && rec == cola) {
                    cab = null;
                    cola = null;
                } else {
                    if (rec == cab) {
                        cab = cab.getSgte();
                        cab.setPrev(cola);
                        cola.setSgte(cab);
                    } else if (rec == cola) {
                        cola = cola.getPrev();
                        cola.setSgte(cab);
                        cab.setPrev(cola);
                    } else {
                        rec.getPrev().setSgte(rec.getSgte());
                        rec.getSgte().setPrev(rec.getPrev());
                    }
                }
                return;
            }
            rec = rec.getSgte();
        } while (rec != cab);
    }

    public void imprimirNodos(){
        Nodo rec = cab;
        do{
            System.out.println(rec);
            rec = rec.getSgte();
        }while(rec!=cab);
    }

    public void imprimirNodosTres(){
        Nodo rec = cab;
        int i = 0;
        while(i<3){
            do{
                System.out.println(rec);
                rec = rec.getSgte();
            }while(rec!=cab);
            i++;
        }

    }

}
