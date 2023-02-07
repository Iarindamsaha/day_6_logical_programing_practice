import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long number");
        long input = sc.nextLong();
        System.out.println("Entered Number is --->"+input);
        long reverse =0;

        while (input!=0){
            long remain = input % 10;
            reverse = reverse*10+remain;
            input= input/10;

        }

        System.out.print("Reverse of The Entered number is--->"+reverse);
    }
}
