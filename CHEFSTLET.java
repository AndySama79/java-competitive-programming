import java.util.Scanner;
public class CHEFSTLET {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String S1=sc.next();
            String S2=sc.next();
            int min=0, max=0;
            int len=S1.length();
            for(int i=0;i<len;i++){
                if(S1.charAt(i)!=S2.charAt(i) || (S1.charAt(i)=='?' && S2.charAt(i)!='?')||
                        (S2.charAt(i)=='?' && S1.charAt(i)!='?') || (S1.charAt(i)=='?' && S2.charAt(i)=='?')) {
                    max++;
                }
                if(S1.charAt(i)!=S2.charAt(i) && S1.charAt(i)!='?' && S2.charAt(i)!='?'){
                    min++;
                }
            }
            System.out.println(min+" "+max);
            T--;
        }
    }
}
