import java.io.*;
import java.util.Arrays;
public class LastChance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] num = str.trim().split(" ");
            int[] arr = new int[N];
            int minnotes = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(num[i]);
                minnotes += arr[i];
            }
            int temp=arr[N-1];
            minnotes=minnotes-temp+1;
                Arrays.sort(arr);
                //int pos = N - 1;
                //int den = 1;
                int notes = 0;
                if (N > 2) {
                    for ( int i = 0; i < 2; i++) {
                        int count = 0;
                        for (int j = 0; j < N; j++) {
                            if (arr[j] % arr[i] == 0) {
                                count++;
                                notes = notes + arr[j] / arr[i];
                            }
                        }
                        if (count == N && arr[i] != 1) {
                            //den=arr[i];
                            notes = notes - (arr[N - 1] / arr[0]);
                            arr[N - 1] = arr[0];
                            notes = notes + (arr[N - 1] / arr[0]);

                        }
                        if (count == N - 1 && arr[i] != 1) {
                            //den=arr[i];
                            notes = notes + 1;

                        }
                        if(minnotes>notes){
                            minnotes=notes;
                        }
                    }
                }
                else{
                    minnotes=N;
                }
            System.out.println(minnotes);
            }
        }
    }
