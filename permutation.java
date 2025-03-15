package Recurssion;

public class permutation {
    public static void printarrange(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            String right=s.substring(i+1);
            String left=s.substring(0,i);

            printarrange(ans+a,left+right);

        }
    }
    public static void main(String[] args) {
        String s= "abc";
        printarrange("",s);
    }
}
