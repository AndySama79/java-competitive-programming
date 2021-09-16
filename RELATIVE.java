import java.util.Scanner;
public class RELATIVE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0){
            int g=sc.nextInt();
            int c=sc.nextInt();
            int H=(c*c)/(2*g);
            System.out.println(H);
        }
    }
}
