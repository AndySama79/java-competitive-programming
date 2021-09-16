import java.math.BigInteger;
import java.util.Scanner;
public class FCTRL02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            System.out.println(fact(sc.nextInt()));
            T--;
        }
    }

    public static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}




