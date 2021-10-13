import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem url: https://projecteuler.net/problem=3
 * 
 * @author Josep Monclus
 */
public class problem0003 {
    
    private static List<BigInteger> primes = new ArrayList<>();
    
    public static void main(String[] args) {
        BigInteger n = new BigInteger("600851475143");
        BigInteger largestPrime = BigInteger.ONE;

        findPrimesBelow(n);

        for(BigInteger prime : primes) {
            if(n.mod(prime).compareTo(BigInteger.ZERO) == 0) {
                largestPrime = prime;
                System.out.println(prime);
            }
        }

        System.out.println("Largest Prime: " + largestPrime);
    }

    private static void findPrimesBelow(BigInteger n) {
        if(primes.isEmpty()) primes.add(new BigInteger("2"));

        for(BigInteger i = primes.get(primes.size() - 1); i.compareTo(n.divide(primes.get(primes.size() - 1))) < 0; i = i.add(BigInteger.ONE)) {
            if(isPrime(i)) {
                primes.add(i);
                //System.out.println(i);
            }
        }
    }

    private static boolean isPrime(BigInteger i) {
        boolean isPrime = true;
        
        for(BigInteger prime : primes) {
            if(i.mod(prime).compareTo(BigInteger.ZERO) == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
