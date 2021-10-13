import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem0010 {

    private static List<Integer> primes = new ArrayList<>();
    public static void main(String[] args) {
        int primesBelow = 2000000;

        BigInteger sum = BigInteger.ZERO;

        for(int i = 2; i < primesBelow; i++) {
            if(isPrime(i)) {
                primes.add(i);

                sum = sum.add(BigInteger.valueOf(i));
            }
        }

        System.out.println("Sum: " + sum);
    }

    private static boolean isPrime(int i) {
        boolean isPrime = true;
        
        for(int prime : primes) {
            if(i % prime == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
