package graph.classActivity1;

public class AdjacencyGraphMatrix {

    private int[][] addMatrix; // 2D array to store the graph
    private int vertices; // Number of vertices in the graph


    public AdjacencyGraphMatrix(int size) {
        this.vertices = size;
        addMatrix = new int[size][size]; // Initialize matrix with 0s
    }

    public void addEdge(int u, int v){
        addMatrix[u][v] = 1; // connect u -> v
        addMatrix[v][u] = 1; // connect v -> u (undirected)

    }

    public void printMatrix(){
        for(int[] row : addMatrix){ // Iterate through each row
            for(int val : row){ // Iterate through each value in the row
                System.out.print(val + " ");
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyGraphMatrix graph = new AdjacencyGraphMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);


        System.out.println("Adjancency Matrix:");
        graph.printMatrix();
    }
}
