package novenaClase;

import java.util.*;

public class WeightedGraph {
    private Map<String, Map<String, Integer>> adjList;

    public WeightedGraph() {
        adjList = new HashMap<>();
    }

    public void addEdge(String src, String dest, int weight) {
        adjList.computeIfAbsent(src, k -> new HashMap<>()).put(dest, weight);
        adjList.computeIfAbsent(dest, k -> new HashMap<>()).put(src, weight);
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print("Costo de los viajes \n ciudad " + vertex + " a la(s) ciudad(es) ");
            System.out.println(adjList.get(vertex));
        }
    }
}