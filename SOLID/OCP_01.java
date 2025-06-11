package SOLID;
 
public class OCP_01 {
 
    public interface DiscountStrategy {
        double calculateDiscount(double amount);
    }
 
    public static class RegularCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.1;
        }
    }
 
    public static class PremiumCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.2;
        }
    }
 
    public static class GoldCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.3;
        }
    }
 
    public static class DiscountCalculator {
        public double calculateDiscount(DiscountStrategy strategy, double amount) {
            return strategy.calculateDiscount(amount);
        }
    }
 
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
 
        double regularDiscount = calculator.calculateDiscount(new RegularCustomerDiscount(), 100.0);
        System.out.println("Regular Discount: " + regularDiscount);
 
        double premiumDiscount = calculator.calculateDiscount(new PremiumCustomerDiscount(), 100.0);
        System.out.println("Premium Discount: " + premiumDiscount);
 
        double goldDiscount = calculator.calculateDiscount(new GoldCustomerDiscount(), 100.0);
        System.out.println("Gold Discount: " + goldDiscount);
    }
}
       