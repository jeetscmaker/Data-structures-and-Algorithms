package graph;

import java.util.ArrayList;

/**
 * Adjacency List representation of graph data structure.
 *
 * @author Jitendra
 */

public class Graph_2 {
    private int numVertices;
    private ArrayList<ArrayList<Integer>> adjLists;

    public Graph_2(int numVertices) {
        this.numVertices = numVertices;
        adjLists = new ArrayList<>(numVertices);
    }

    public ArrayList<ArrayList<Integer>> getAdjLists() {
        return adjLists;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setAdjLists(ArrayList<ArrayList<Integer>> adjLists) {
        this.adjLists = adjLists;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    // Add edge
    public void addEdge(int s, int d) {
        adjLists.get(s).add(d);
        adjLists.get(d).add(s);
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 5;
        Graph_2 graph = new Graph_2(V);
        for (int i = 0; i < V; i++)
            graph.getAdjLists().add(new ArrayList<>());

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        printGraph(graph.getAdjLists());
    }

    // Print the graph
    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        ArrayList<Integer> al;
        for (int i = 0; i < am.size(); i++) {
            System.out.print("\nVertex " + i + ":");
            al = am.get(i);
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + al.get(j));
            }
            System.out.println();
        }
    }
}
