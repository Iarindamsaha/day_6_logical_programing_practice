import java.util.Scanner;

public class VendingMachine {

    public static void main(String args[]){

        int notes[] = {1, 2, 5, 10, 50, 100, 500, 1000};
        int notesNeeded[] = new int[notes.length];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Amount:");
        int amount = sc.nextInt();

        int numberOfNotes = 0;

        for (int i = notes.length - 1; i >= 0; i--)
        {
            if (amount >= notes[i])
            {
                notesNeeded[i] = amount / notes[i];
                amount = amount - notesNeeded[i] * notes[i];
            }
        }
        for (int i = notes.length - 1; i >= 0; i--)
        {
            if (notesNeeded[i] != 0)
            {
                numberOfNotes++;
                System.out.println(notes[i] + " : " + notesNeeded[i]);
            }
        }
        System.out.println("Number of Notes Required : " + numberOfNotes);
    }
}
