import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger first = new BigInteger(sc.nextLine());
        BigInteger second = new BigInteger(sc.nextLine());

        // Ensure first is less than or equal to second
        if (first.compareTo(second) > 0) {
            BigInteger temp = first;
            first = second;
            second = temp;
        }

        // Sum of the series from first to second
        BigInteger count = second.subtract(first).add(BigInteger.ONE);
        BigInteger sum = count.multiply(first.add(second)).divide(BigInteger.valueOf(2));

        System.out.println(sum);
    }
}
