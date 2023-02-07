import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check Perfect or Not");
        long input = sc.nextLong();
        long sum =0;
        int i =1;
        while(i<= input/2){
            if (input%i==0){
                sum = sum + i;
            }
            i++;
        }
        if (sum == input){
            System.out.println(input+" is a Perfect number");
        }
        else{
            System.out.println(input+" is not a Perfect number");
        }
    }
}
