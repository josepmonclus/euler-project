/**
 * Problem url: https://projecteuler.net/problem=4
 * 
 * @author Josep Monclus
 */
public class Problem0004 {
    public static void main(String[] args) {
        int max = 999;
        int maxPalindrome = 0;

        for(int i = 1; i <= max; i++) {
            for(int j = 1; j <= max; j++) {
                int value = i * j;

                if(isPalindrome(value) && value > maxPalindrome) {
                    maxPalindrome = value;
                }
            }
        }

        System.out.println("MAX PALINDROME: " + maxPalindrome);
    }

    private static boolean isPalindrome(int value) {
        String sValue = String.valueOf(value);
        String s1 = "", s2 = "";

        if(sValue.length() % 2 == 0) { // Even length
            s1 = sValue.substring(0, sValue.length() / 2);
            s2 = sValue.substring(sValue.length() / 2, sValue.length());
        } else { // Odd length
            s1 = sValue.substring(0, sValue.length() / 2 + 1);
            s2 = sValue.substring(sValue.length() / 2, sValue.length());
        }

        if(s1.equals(reverse(s2))){
            System.out.println(sValue + " - " + s1 + " - " + s2);

            return true;
        }

        return false;
    }


    private static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
}
