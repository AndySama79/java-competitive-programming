import java.util.Scanner;
public class CCISLAND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T>0){
            String num=sc.nextLine();
            String []N=num.split(" ");
            int []arr=new int[5];
            for(int i=0;i<5;i++){
                arr[i]=Integer.parseInt(N[i]);
            }
            if(judge(arr[0],arr[1],arr[2],arr[3],arr[4]))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
    public static boolean judge(int x, int y, int xr, int yr, int D){
        int livex=D+1;
        int ro=Math.min(x/xr,y/yr);
        return ro >= livex;
    }
}
