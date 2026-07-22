public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        long processedNum1 = (long) (num1 * 1000);
        long processedNum2 = (long) (num2 * 1000);

        return processedNum1 == processedNum2;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));   // true
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));    // false
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
    }
}
