import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long start, end;
        double elapsed_time;
        System.out.println("---Type any Number To start the stopwatch---");
        int started = sc.nextInt();

        start = System.currentTimeMillis();

        System.out.println("---Type any Number To stop the stopwatch---");
        int stop = sc.nextInt();

        end = System.currentTimeMillis();

        elapsed_time = (end - start) /1000.0;
        System.out.println("Elapsed Time --->"+elapsed_time+" sec");

    }
}