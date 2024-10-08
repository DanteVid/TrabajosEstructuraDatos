package octavaClase;

import septimaClase.ArbolBinario;
import septimaClase.Nodo;

public class Main {

    public static boolean search(Nodo nodo, char letra){
        if (nodo == null){
            return false;
        }else if (nodo.getData() == letra) {
            return true;
        }
        return search(nodo.getIzq(),letra) || search(nodo.getDer(), letra);
    }

    public static char encontrarMin(Nodo nodo){
        while(nodo.getIzq() != null){
            nodo = nodo.getIzq();
        }
        return nodo.getData();
    }

    public static Nodo borrar(Nodo nodo, char letra){
        if (nodo == null){
            return nodo;
        }else if (letra < nodo.getData()){
            nodo.setIzq(borrar(nodo.getIzq(), letra));
        }else if (letra > nodo.getData()){
            nodo.setDer(borrar(nodo.getDer(), letra));
        }else{
            if(nodo.getIzq()== null && nodo.getDer()==null){
                return null;
            } else if (nodo.getIzq()==null){
                return nodo.getDer();
            } else if (nodo.getDer()==null){
                return nodo.getIzq();
            }
            char min_valor = encontrarMin(nodo.getDer());
            nodo.setData(min_valor);
            nodo.setDer(borrar(nodo.getDer(), letra));
        }
        return nodo;
    }

    public static void inOrder(Nodo nodo){
        if (nodo != null){
            inOrder(nodo.getIzq());
            System.out.print(nodo + " ");
            inOrder(nodo.getDer());
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.setRaiz('A');
        arbol.getRaiz().setIzq('B');
        arbol.getRaiz().setDer('C');
        arbol.getRaiz().getIzq().setIzq('D');
        arbol.getRaiz().getIzq().setDer('E');
        arbol.getRaiz().getDer().setDer('F');

        System.out.println(search(arbol.getRaiz(),'D'));
        System.out.println(search(arbol.getRaiz(), 'F'));
        System.out.println(search(arbol.getRaiz(), 'G'));

        inOrder(arbol.getRaiz());
        borrar(arbol.getRaiz(), 'D');
        System.out.println();
        inOrder(arbol.getRaiz());
    }
}