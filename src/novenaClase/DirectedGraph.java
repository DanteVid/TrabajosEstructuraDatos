package novenaClase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
    private Map<String, List<String>> adjList;

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    public void addEdge(String src, String dest) {
        adjList.computeIfAbsent(src, k -> new ArrayList<>()).add(dest);
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print("Usuario " + vertex + " sigue a ");
            System.out.println("usuario " + adjList.get(vertex));
        }
    }
}
