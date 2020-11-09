package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final int maxVertices = 20;
    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private int vertexCount;
    private Stack<Integer> stack; // for DFS
    private Queue<Integer> queue; // for BFS

    public Graph() {
        vertexList = new Vertex[maxVertices];
        vertexCount = 0;
        stack = new Stack<>();
        queue = new LinkedList<>();
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    /* Depth first search algorithm */
    public void dfs() {
        vertexList[0].visited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            // get an unvisited adjacent vertex of current vertex.
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1)
                stack.pop();
            else {
                vertexList[v].visited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        // reset the flags
        for (int i = 0; i < vertexList.length; i++) {
            vertexList[i].visited = false;
        }
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < vertexCount; j++) {
            if (adjMatrix[v][j] == 1 && vertexList[v].visited == false)
                return j;
        }
        return -1;
    }

    /* Breadth first search algorithm */
    public void bfs() {
        //TODO
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int i, int j, boolean isDirectedEdge) {
        adjMatrix[i][j] = 1;
        if (isDirectedEdge)
            adjMatrix[j][i] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
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
