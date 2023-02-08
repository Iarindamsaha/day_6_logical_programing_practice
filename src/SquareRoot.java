import java.util.Scanner;

public class SquareRoot {

    static double epsilon = 1e-15;

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Non-Negative Number : ");
        int c = sc.nextInt();
        System.out.println("The Square Root is : " + sqrt(c));

    }

    public static double sqrt(int a){

        double t = a;
        while (Math.abs(t-a/t) > epsilon * t){
            t = (a/t+t)/2;
        }
        return t;
    }
}
