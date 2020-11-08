package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final int maxVertices = 20;
    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private int vertexCount;
    private Stack stack; // for DFS
    private Queue queue; // for BFS

    public Graph() {
        vertexList = new Vertex[maxVertices];
        vertexCount = 0;
        stack = new Stack();
        queue = new LinkedList();
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void dfs() {
        //TODO
    }

    public void bfs() {
        //TODO
    }
}

class Vertex {
    public char label;
    public boolean visited;

    public Vertex(char l) {
        label = l;
        visited = false;
    }
}
