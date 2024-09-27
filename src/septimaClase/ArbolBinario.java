package septimaClase;

public class ArbolBinario {
    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(char letra) {
        Nodo raiz = new Nodo(letra, null, null);
        this.raiz = raiz;
    }
}
