package ARRAYS;

public class Traversal {

    public void traverseAndPrintArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={12, 23, 34 ,45, 48,67};

        Traversal traversal = new Traversal();
        traversal.traverseAndPrintArray(arr);
    }
}
