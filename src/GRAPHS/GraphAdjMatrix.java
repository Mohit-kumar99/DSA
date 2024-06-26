package GRAPHS;

public class GraphAdjMatrix {
    public static void main(String[] args) {
        int adjMatrix[][]=new int [5][5];
        addEdges(adjMatrix,0,1);
        addEdges(adjMatrix,0,2);
        addEdges(adjMatrix,0,3);

        addEdges(adjMatrix,1,4);
        addEdges(adjMatrix,2,3);
        addEdges(adjMatrix,3,4);

        displayMatrix(adjMatrix);

    }
    //i-->row , j-->col
    public  static void addEdges(int adjMatrix[][], int i,int j){
        adjMatrix[i][j]=1;
        adjMatrix[j][i]=1;

    }

    public static void displayMatrix(int matrix[][]){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
