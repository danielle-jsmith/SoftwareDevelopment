import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        //create object scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = reader.nextInt();

        if (number <= -1)
        {
            //if the above is true, execute the below code
            System.out.println("This number is negative");
        }
        else if (number <=0 && number % 2 == 0)
        {
            //if statement is true then execute the code
            System.out.println("This number is even");
        }
        else
        {
            //if the above statement is all true, execute the code
            System.out.println("This number is odd");
        }
    }
    }