import java.io.*;
import java.util.Arrays;
public class  JULY21C{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T-->0){
            int N=Integer.parseInt(br.readLine());
            String str=br.readLine();
            String []num=str.trim().split(" ");
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(num[i]);
            }
            Arrays.sort(arr);
            int total=0;
            int den=1;
            int pos=N-1;
            if(N>2) {
                for (int i = 1; i >= 0; i--) {
                    int count = 0;
                    for (int j = N - 1; j >= 0; j--) {
                        if (arr[j] % arr[i] == 0) {
                            count++;
                        } else {
                            pos = j;
                        }
                    }
                    if (count == N || count == N - 1 && arr[i]!=1) {
                        den = arr[i];
                        if(count == N){
                            arr[N-1]=den;
                        }
                        if(count == N-1) {
                            arr[pos] = den;
                        }
                        break;
                    }
                }
                if(den==1){
                    arr[N-1]=1;
                }
                for(int i=0;i<N;i++){
                    total=total+(arr[i]/den);
                }
            }
            else{
                total=N;
            }
            System.out.println(total);
        }
    }
}

