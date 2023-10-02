package HWork1;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, double discountAmount){
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100){
            throw new ArithmeticException("Invalid arguments");
        }
        double result = purchaseAmount * discountAmount / 100;
        return purchaseAmount - result;
    }
}
