import java.math.BigInteger;

public class problem14 {
    public static void main(String[] args) {
        System.out.println("Starting...");

        int nStart = 1000000;
        int nMax = 0, kMax = 0;

        for(int i = nStart; i > 1; i--){
            BigInteger n = BigInteger.valueOf(i);
            int k = 1;

            while (n.compareTo(BigInteger.valueOf(1)) != 0) {
                //System.out.println(i + " - " + n);
                if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) { //odd
                    n = n.divide(BigInteger.valueOf(2));
                } else { // even
                    n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
                }

                k++;
            }

            System.out.println("n = " + i + " - k = " + k);

            if(k > kMax) {
                System.out.println("MAX!!");
                nMax = i;
                kMax = k;
            }
        }

        System.out.println("n = " + nMax + " - k = " + kMax);
        System.out.println("Finished!");
    }
}