import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Convert To Binary: ");
        int decimal = sc.nextInt();
        System.out.println(decimal + " Converted To Binary = ");
        toBinary(decimal);
        System.out.println(" ");
        System.out.println("-----Also Represented As-----");
        System.out.println(decimal+ " = "+padded4byteString(decimal));


    }

    public static void toBinary(int decimal) {

        int[] binaryString = new int[1000000];
        int i = 0;
        while ( decimal > 0){

            binaryString[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--){
            System.out.print(binaryString[j]);
        }
    }

    public static String padded4byteString(int decimal){

        int i =2;
        String string1 = "";
        String character = "";
        while (decimal > 0){

            if (decimal / i == 0){

                if(string1.length() != 0){
                    character = "+";
                }
                string1 = string1 + character + (i/2);
                decimal = decimal - (i/2);
                i = 2;
            } else if (decimal == 1) {
                return string1 + " + 1";
            }
            else {
                i = i * 2;
            }

        }
        return string1;
    }

}
