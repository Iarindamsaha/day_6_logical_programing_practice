import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args)
    {

        int month, day, year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date = ");
        day = sc.nextInt();
        System.out.println("Enter Month = ");
        month = sc.nextInt();
        System.out.println("Enter Year = ");
        year = sc.nextInt();

        if (day >= 1 && day <= 31 || month >= 1 && month <= 12)
        {
            int y = year - (14 - month) / 12;
            int x = y + y / 4 - y / 100 + y / 400;
            int m = month + 12 * ((14 - month) / 12) - 2;
            int d = (day + x + 31 * m / 12) % 7;


            switch (d)
            {
                case 0:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Sunday");
                    break;
                case 1:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Monday");
                    break;
                case 2:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Tuesday");
                    break;
                case 3:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Wednesday");
                    break;
                case 4:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Thursday");
                    break;
                case 5:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Friday");
                    break;
                case 6:
                    System.out.println(day+"/"+month+"/"+year+" Day of The Week = Saturday");
                    break;
                default:
                    System.out.println("NA");
            }
        }
    }
}
