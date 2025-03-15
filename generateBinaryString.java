package Recurssion;

public class generateBinaryString {
    public static void generate(int length,String ans){
        int m=ans.length();

        if(ans.length()==length){
            System.out.println(ans);
            return;
        }




        if( m==0||ans.charAt(m-1)!='1') {

            generate(length, ans + "1");
            generate(length,ans+"0");

        }
        else{

            generate(length,ans+"0");

        }
    }
    public static void main(String[] args) {
        int l=3;
        generate(l,"");
    }
}
