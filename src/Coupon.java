import java.util.Scanner;

public class Coupon {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Coupon Needed");
        int couponNumber = sc.nextInt();
        randomDistinctCoupons(couponNumber);
    }

    public static void randomDistinctCoupons(int couponNumbers) {

        int randomNumberNeeded = 0, count = 0; //for loop purpose
        int coupons[] = new int[couponNumbers];

        while (count < couponNumbers) {

            boolean flag = true;
            int randomNumbers = (int)Math.floor(Math.random() * 100);
            randomNumberNeeded++;

            for (int i = 0; i < coupons.length; i++) {

                if (coupons[i] == randomNumbers) {

                    flag = false;
                }
            }
            if (flag == true) {

                coupons[count++] = randomNumbers;
            }
        }


        System.out.println("Random Number Needed = " + randomNumberNeeded);

    }
}

