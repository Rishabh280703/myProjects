package Recurssion;

public class Subsets {
    public static void substr(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;

        }
        char a=s.charAt(i);
        substr(s,i+1,ans);
        substr(s,i+1,ans+a);
    }
    public static void main(String[] args) {
        String s="abc";
        substr(s,0,"");
    }
}
