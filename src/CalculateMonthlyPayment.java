import java.util.Scanner;

public class CalculateMonthlyPayment {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Years to Pay off = ");
        int year = sc.nextInt();

        System.out.println("Enter Principle Loan Amount = ");
        int pl = sc.nextInt();

        System.out.println("Enter Per Cent Interest Compound = ");
        int r = sc.nextInt();

        System.out.println("Monthly Payment = " + (float) monthlyPayment(pl, year, r));
    }

    public static double monthlyPayment(double p, double y, double r) {
        double r1 = r / (12 * 100);
        double n = 12 * y;
        double payment = (p * r) / (1 - Math.pow((1 + r1), -n));
        return payment;

    }
}
