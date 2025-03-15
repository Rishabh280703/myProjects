package Recurssion;

public class greatestCommonDivisor {
    public static int hcf(int a, int b){
        if(b%a==0) return a;
        return hcf(b%a,a);

    }
    public static void main(String[] args) {
        int a=24;
        int b=60;
        System.out.println(hcf(a,b));
    }
}
