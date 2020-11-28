package graph;

import java.util.ArrayList;

/**
 * Adjacency List representation of graph data structure.
 *
 * @author Jitendra
 */

public class Graph_2 {
    // Add edge
    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            am.add(new ArrayList<>());

        // Add edges
        addEdge(am, 0, 1);
        addEdge(am, 0, 2);
        addEdge(am, 0, 3);
        addEdge(am, 1, 2);

        printGraph(am);
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
