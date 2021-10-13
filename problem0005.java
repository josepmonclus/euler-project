/**
 * Problem url: https://projecteuler.net/problem=5
 * 
 * @author Josep Monclus
 */
public class problem0005 {
    public static void main(String[] args) {
        int maxMult = 20;

        int value = 1;

        while(true) {
            boolean found = true;

            for(int i = 1; i <= maxMult; i++) {
                if(value % i != 0) {
                    found = false;
                    break;
                }
            }

            if(found) break;

            value++;
        }

        System.out.println("Value: " + value);
    }
}
