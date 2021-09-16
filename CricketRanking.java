import java.util.Scanner;
public class CricketRanking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String []stat1=s1.trim().split(" ");
            String []stat2=s2.trim().split(" ");
            int c1=0,c2=0;
            for(int i=0;i<3;i++){
                if(Integer.parseInt(stat1[i])==Integer.parseInt(stat2[i]))
                    return;
                else if(Integer.parseInt(stat1[i])>Integer.parseInt(stat2[i]))
                    c1++;
                else
                    c2++;
            }
            System.out.println(c1 > c2 ? "A" : "B");
        }
    }
}
