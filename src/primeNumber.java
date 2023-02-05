import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,flag=0;
        System.out.println("Enter The Number");
        int input = sc.nextInt();
        int check = input/2;

        if (input==0||input==1){

            System.out.println("Its Not a Prime Number");
        }
        else{
            for(i =2; i <= check; i++){
                if (input%i==0){
                    System.out.println("The number is not a prime number");
                    flag=1;
                    break;
                }

            }
            if (flag == 0){
                System.out.println("The Number is Prime number");
            }
        }
    }
}
