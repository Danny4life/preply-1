package graph.classActivity2;

import graph.classActivity1.AdjacencyGraphMatrix;

import java.util.LinkedList;

public class AdjacencyGraphList {

    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adList; // Adjacency List

    public AdjacencyGraphList(int size) {
        vertices = size;
        adList = new LinkedList[size]; // Array of lists

        for(int i = 0; i < size; i++){
            adList[i] = new LinkedList<>(); // Initialize each list
        }
    }

    // Add an edge
    public void addEdge(int u, int v){
        adList[u].add(v); // connect u -> v
        adList[v].add(u); // connect v -> u

    }

    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.println(i + " -> ");
            for(int neighbor : adList[i]){
                System.out.println(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyGraphList graph = new AdjacencyGraphList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        System.out.println("Adjacency List:");
        graph.printGraph();
    }
}
