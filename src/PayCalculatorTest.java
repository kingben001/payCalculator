public class PayCalculatorTest {
    public static void main(String[] args) {

        double payRate=25.50;
        double hour=9.75;
        PayCalculator regularPay = new RegularPay(payRate);
        System.out.println("The regular pay is $ "+regularPay.computePay(hour)); //computes reg pay

        PayCalculator hazardPay = new HazardPay(payRate);
        System.out.println("The hazard pay is $ "+hazardPay.computePay(hour)); //computes haz pay
    }

}