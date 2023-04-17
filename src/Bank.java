import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        //create object scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Please input the amount of money you have in the bank to check if it is protected");
        int number = reader.nextInt();

        if (number >= 1 && number <=85000)
        {
            //if above statement is true, execute the code
            System.out.println("Yes! Your money is protected :)");
        }
        else
        {
            //if above statement is true, execute the code
            System.out.println("No! Your money is not protected :( " );
        }
    }
}
