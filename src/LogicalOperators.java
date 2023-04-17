import java.util.Scanner;
public class LogicalOperators {
    //logical operators are used to connect two or more expressions
        //&& = AND both conditions should be true
        //|| = OR one of the conditions must be true
        //! NOT none of the conditions are true
    public static void main(String[] args) {
        //create object scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Please guess my favourite shoe colour");
        String response = reader.nextLine();

        if (response.equals("black") || response.equals("brown"))
        {
            //if above statement is true, execute the code
            System.out.println("Yes! :)");
        }
        else if (response.equals("red"))
        {
            //if above statement is true, execute the code
            System.out.println("False!");
        }
        else
        {
            //if above statement is true, execute the code
            System.out.println("Nope! :( " );
        }
    }
}

