import java.util.ArrayList;
import java.util.List;

/**
 * Problem url: https://projecteuler.net/problem=2
 * 
 * @author Josep Monclus
 */
public class Problem0002 {
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);

        //System.out.println(fibonacci.get(fibonacci.size() - 2));
        //System.out.println(fibonacci.get(fibonacci.size() - 1));

        int totalEven = 2;

        while(fibonacci.get(fibonacci.size() - 1) < 4000000) {
            int newValue = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            
            if(newValue < 4000000) {
                fibonacci.add(newValue);
                
                if(newValue % 2 == 0){
                    totalEven += newValue;
                }

                //System.out.println(fibonacci.get(fibonacci.size() - 1));
            } else {
                break;
            }
        }

        System.out.println("TOTAL = " + totalEven);
    }
}
