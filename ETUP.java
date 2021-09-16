import java.util.Scanner;
import java.util.Arrays;
public class ETUP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
             int N=sc.nextInt();
             int Q=sc.nextInt();
             int []arr=new int[N];
             for(int i=0; i<N; i++)
             {
                 arr[i]=sc.nextInt();
                 if(arr[i]%2==0)
                     arr[i]=0;
                 else
                     arr[i]=1;
             }
             while(Q-->0){
                 int L=sc.nextInt()-1;
                 int R=sc.nextInt();
                 int even=0,odd=0;
                 int []sub=Arrays.copyOfRange(arr,L,R);
                 for(int i=0;i<sub.length;i++){
                     if(sub[i]==0)
                         even++;
                     else
                         odd++;
                 }
                 int possibles=fact(even)/(6*fact(even-3)) + (fact(even)*fact(odd))/(fact(even-1)*fact(even-2)*2);
                 System.out.println(possibles);
             }
        }
    }
    public static int fact(int num){
        int f=1;
        for(int i=1;i<=num;i++)
            f*=i;
        return f;
    }
}
