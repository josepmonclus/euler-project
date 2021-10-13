import java.util.ArrayList;
import java.util.List;

public class problem0007 {

    private static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) {
        int nPrime = 10001;
                
        for(int i = 2; primes.size() < nPrime; i++){
            if(isPrime(i)) primes.add(i);
        }

        System.out.println(primes.get(primes.size() - 1));
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
