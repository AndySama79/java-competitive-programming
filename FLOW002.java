import java.util.Scanner;
public class FLOW002{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String num=sc.nextLine();
            String []N=num.split(" ");
            int result=rem(Integer.parseInt(N[0]),Integer.parseInt(N[1]));
            System.out.println(result);
        }
    }
    public static int rem(int a, int b){
        if(a>=b)
            return a%b;
        else
            return a;
    }
}