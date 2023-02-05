import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ending Point");
        int input = sc.nextInt();
        int n1=0, n2=1, n3, i;
        for(i=0; i<=input;i++){
            System.out.println(n1);
            n3 =n1 + n2;
            n1=n2;
            n2=n3;
        }
    }
}
