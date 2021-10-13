import java.math.BigInteger;

public class problem14_v2 {
    public static void main(String[] args) {
        
        BigInteger n = BigInteger.valueOf(999167);
        int k = 1;

        while (n.compareTo(BigInteger.valueOf(1)) != 0) {
            System.out.println(n);

            if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) { // odd
                n = n.divide(BigInteger.valueOf(2));
            } else { // even
                n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
            }

            k++;
        }

        System.out.println("n = " + n + " - k = " + k);
    }
}
