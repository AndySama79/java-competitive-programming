import java.util.Scanner;
public class THREDICE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            float P=0f;
            if((X+Y)<=6)
                P= 1-(X+Y)/6f;
            System.out.printf("%.6f",P);
            System.out.println();
        }
    }
}
