
    /* package codechef; // don't place package name! */

import java.util.Scanner;


    /* Name of the class has to be "Main" only if the class is public. */
    class FLOW017
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            sc.nextLine();
            while(T>0){
                String []N=(sc.nextLine()).split(" ");
                System.out.println(lar2(N));
                T--;
            }
        }
        public static int lar2(String []arr){
            int t=0;
            int []a=new int[3];
            for(int i=0;i<3;i++) {
                a[i]=Integer.parseInt(arr[i]);
            }
            for(int i=0;i<3-1;i++){
                for(int j=i+1;j<3;j++){
                    if(a[i]>a[j]){
                        t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            return a[1];
        }
    }

