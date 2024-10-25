package novenaClase;

public class Main {
    public static void main(String[] args) {
        Graph grafo = new Graph();
        grafo.addEdge("A", "B");
        grafo.addEdge("B", "C");
        grafo.addEdge("A", "C");
        grafo.addEdge("C", "D");
        grafo.printGraph();

        System.out.println();

        DirectedGraph grafoDirigido = new DirectedGraph();
        grafoDirigido.addEdge("1", "2");
        grafoDirigido.addEdge("1", "3");
        grafoDirigido.addEdge("2", "4");
        grafoDirigido.addEdge("3", "2");
        grafoDirigido.addEdge("3", "4");
        grafoDirigido.printGraph();

        System.out.println();

        WeightedGraph grafoPonderado = new WeightedGraph();
        grafoPonderado.addEdge("A", "B", 10);
        grafoPonderado.addEdge("A", "C", 15);
        grafoPonderado.addEdge("B", "C", 5);
        grafoPonderado.addEdge("B", "D", 20);
        grafoPonderado.addEdge("C", "D", 30);
        grafoPonderado.printGraph();

    }
}