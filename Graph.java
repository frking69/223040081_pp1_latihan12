public class Graph {

    private Vertex[] vertexList; // array of vertices
    private int[][] adjMat; // adjacency matrix
    private int nVerts; // current number of vertices

    // Constructor
    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        // Set adjacency matrix to 0
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // Method to add a vertex
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    // Method to add an edge
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    // Method to display the vertex
    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel());
    }

    // Method to print adjacency matrix
    public void adjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Additional methods like DFS, BFS can be added here

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);

        System.out.println("Vertices in the graph:");
        for (int i = 0; i < graph.nVerts; i++) {
            graph.displayVertex(i);
            System.out.println();
        }

        graph.adjacencyMatrix();
    }
}
