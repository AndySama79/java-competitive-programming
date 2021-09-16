import java.util.Arrays;
import java.io.*;
public class MINNOTES {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int []arr = new int[N];
            String str=br.readLine();
            String []in=str.trim().split(" ");
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);// important for reducing the code involved in finding gcd
            int maxNum=0;//maximum number of factors
            int pos=0;
            int den;//position of maxNum
            for (int i = 0; i < N; i++) {
                int count=0;
                for(int j=0;j<N;j++) {
                    if(arr[j]%arr[i]==0)
                        count++;
                }
                if (maxNum <= count) {
                    maxNum = count;
                    pos = i;
                }
            }
            if(maxNum==N) {
                den = arr[pos];
                arr[N-1] = arr[0];
            }
            else if(maxNum==N-1){
                den=arr[pos];
                for(int i=N-1;i>=0;i--){
                    if(arr[i]%den!=0)
                        arr[i]=den;
                }
            }
            else {
                den = 1;
                arr[N-1]=den;
            }
            int total=0;
            for(int i=0;i<N;i++){
                total=total+(arr[i]/den);
            }
            System.out.println(total);
        }
    }
}
