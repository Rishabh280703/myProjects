package Recurssion;

public class Arraytraversal {
    public static void print(int i,int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,7,3,9,54,22};
        print(0,arr);
    }
}
