import java.util.Scanner;
public class FLOW007{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        //sc.nextLine();
        while(T>0){
            System.out.println(rev(sc.next()));
            T--;
        }
    }
    public static String rev(String str){
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev.trim();
    }
}