import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like? ");
        int timesTable = reader.nextInt();

            for(int x = 1; x < 13; x = ++x)
        {
            System.out.printf("%d x %d = %d", x, timesTable, timesTable * x);
            System.out.print("\n");
        }
    }
}
