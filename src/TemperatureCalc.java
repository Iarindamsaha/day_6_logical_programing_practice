import java.util.Scanner;

public class TemperatureCalc {
        public static void centigrade(float a){
            if (a >= 0 && a <= 100) {
                float F = (a * 9 / 5) + 32;
                System.out.println(a + "Degree C = " + F + "Degree F");
            }
            else{
                System.out.println("Inputs are not within the Freezing Point \n Please Enter Between 0DegreeC to 100DegreeC");
            }
        }
        public static void fahrenheit(float b) {
            if (b >= 32 && b <= 212) {
                float C = (b - 32) * 5 / 9;
                System.out.println(b + "Degree F = " + C + "Degree C");
            } else {
                System.out.println("Inputs are not within the Freezing Point \n Please Enter Between 32DegreeF to 212DegreeF");
            }

        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome To The Temperature Convert Application Press Any Number To Continue");
            int any = sc.nextInt();
            int input;
            do {
                System.out.println("Press 1 To Convert Temperature From Centigrade To Fahrenheit\nPress 2 To Covert Temperature From Fahrenheit To Centigrade\nPress 3 To Exit");
                input  = sc.nextInt();
                switch (input){
                    case 1:{
                        System.out.println("Please Enter Your Value");
                        float input_1 = sc.nextFloat();
                        centigrade(input_1);
                        break;
                    }
                    case 2:{
                        System.out.println("Please Enter Your Value");
                        float input_1 = sc.nextFloat();
                        fahrenheit(input_1);
                        break;
                    }
                    case 3:{
                        System.out.println("Application Closed");
                        break;
                    }
                    default: {
                        System.out.println("Please Choose The Right Option");
                        break;
                    }
                }

            }while (input!=3);
            sc.close();
        }
}
