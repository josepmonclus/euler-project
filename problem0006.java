public class Problem0006 {
    
    public static void main(String[] args) {
        int maxValue = 100;

        int sumOfSquares = sumOfSquares(maxValue);
        int squareOfSums = squareOfSums(maxValue);

        int diff = squareOfSums - sumOfSquares;

        System.out.println("Difference: " + diff);
    }

    private static int sumOfSquares(int maxValue) {
        int sumOfSquares = 0;

        for(int i = 1; i <= maxValue; i++) {
            sumOfSquares += i * i;
        }

        return sumOfSquares;
    }

    private static int squareOfSums(int maxValue) {
        int squareOfSums = 0;

        for(int i = 1; i <= maxValue; i++) {
            squareOfSums += i;
        }

        squareOfSums = squareOfSums * squareOfSums;

        return squareOfSums;
    }
}
