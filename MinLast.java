import java.io.*;
class MinLast{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int TC=Integer.parseInt(br.readLine());
        while(TC-->0){
            int N=Integer.parseInt(br.readLine());
            int[] arr=new int[N];
            String str=br.readLine();
            String[] num=str.split(" ");
            int sum=0;
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(num[i]);
                sum+=arr[i];
            }
            if(N<=2){
                System.out.println(N);
                continue;
            }
            int[] pref=new int[N];
            int[] suf=new int[N];

            pref[0]=arr[0];
            for(int i=1;i<N;i++){
                pref[i]=gcd(pref[i-1],arr[i]);
            }

            suf[N-1]=arr[N-1];
            for(int i=N-2;i>=0;i--){
                suf[i]=gcd(suf[i+1],arr[i]);
            }

            int ans=sum/pref[N-1];
            for(int i=0;i<N;i++){
                int k=gcd((i-1<0?0:pref[i-1]),(i+1>=N?0:suf[i+1]));
                ans=Math.min(ans,(sum-arr[i])/k + 1);
            }
            System.out.println(ans);
        }
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
