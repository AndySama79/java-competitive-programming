import java.util.Scanner;
public class FLOW001 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String num=sc.nextLine();
            String []N=num.split(" ");
            int result=add(Integer.parseInt(N[0]),Integer.parseInt(N[1]));
            System.out.println(result);
        }
    }
    public static int add(int a ,int b){
        return a+b;
    }
}
