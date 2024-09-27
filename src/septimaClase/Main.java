package septimaClase;

public class Main {

    public static void inOrder(Nodo nodo){
        if (nodo != null){
            inOrder(nodo.getIzq());
            System.out.print(nodo + " ");
            inOrder(nodo.getDer());
        }
    }

    public static void preOrder(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo + " ");
            preOrder(nodo.getIzq());
            preOrder(nodo.getDer());
        }
    }

    public static void postOrder(Nodo nodo){
        if (nodo != null){
            postOrder(nodo.getIzq());
            postOrder(nodo.getDer());
            System.out.print(nodo + " ");
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

        inOrder(arbol.getRaiz());
        System.out.println();
        preOrder(arbol.getRaiz());
        System.out.println();
        postOrder(arbol.getRaiz());
    }
}
