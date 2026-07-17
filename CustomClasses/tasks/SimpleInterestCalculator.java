import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleInterestCalculator {
    private BigDecimal principal;
    private BigDecimal interestRate;

    // more info about class methods will be in the upcoming examples, this is just a preview
    public SimpleInterestCalculator(BigDecimal principal, BigDecimal interestRate) {
        if (principal == null || interestRate == null) {
            // more info about error handling will be in the upcoming examples, this is just a preview
            throw new IllegalArgumentException("Principal and Interest Rate cannot be null");
        }
        if (principal.compareTo(BigDecimal.ZERO) < 0 || interestRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Principal and Interest Rate cannot be negative");
        }
        this.principal = principal;
        this.interestRate = interestRate;
    }

    public BigDecimal calculateInterest(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Years cannot be negative");
        }

        BigDecimal yearsBigDecimal = BigDecimal.valueOf(years);
        BigDecimal interest = principal.multiply(interestRate).multiply(yearsBigDecimal);
        return interest.setScale(2, RoundingMode.HALF_UP); // Set scale to 2 decimal places
    }

    public static void main(String[] args) {
        try {
            BigDecimal principal = new BigDecimal("10000");
            BigDecimal interestRate = new BigDecimal("0.05");

            SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, interestRate);
            int years = 3;

            BigDecimal interest = calculator.calculateInterest(years);
            System.out.println("Simple Interest for " + years + " years: " + interest);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
