package Recurssion;

public class generateParentheses {
    public static void print(int open,int close,int n,String s) {
        if(s.length()==2*n){
            System.out.println(s);
            return;

        }
        if (open < n ) {
            print(open + 1, close, n, s + '(');
        }
        if (close < open) {
            print(open, close + 1, n, s + ')');
        }
    }
    public static void main(String[] args) {
        int n=3;
        print(0,0,n,"");
    }
}
