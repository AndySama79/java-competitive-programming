import java.util.Scanner;
public class EITA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0){
            int d=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int work1=7*x;
            int work2=y*d+(7-d)*z;
            System.out.println(Math.max(work1,work2));
        }
    }
}
