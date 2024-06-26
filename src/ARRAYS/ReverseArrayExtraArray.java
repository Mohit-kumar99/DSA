package ARRAYS;
//Array Reverse Using an Extra Array
public class ReverseArrayExtraArray {
    public static void reverseArrayExtraArray(int []arr){
        int []reversedArr = new int [arr.length];
        for(int i=0; i<arr.length; i++){
            reversedArr[i] = arr[arr.length-i-1];
        }
        System.out.println("Reverse Array: ");
        for (int i:  reversedArr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []orArr = {1, 2, 3, 4, 5, 6};
        reverseArrayExtraArray(orArr);

    }
}
