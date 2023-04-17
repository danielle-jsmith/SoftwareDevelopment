import java.util.Scanner;
public class StoreOpen {
    public static void main(String[] args) {
        //create object scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the Store open? Y or N");
        String response = reader.nextLine();
        if (response.equals ("Y")|| response.equals("N")){
        if (!response.equals("Y")) {
            //if above statement is true, execute the code
            System.out.println("Sorry the store is closed :(");
        } else if (response.equals("Y")) {
            //if above statement is true, execute the code
            System.out.println("Yes the store is open :)");

        }} else
            System.out.println("Wrong response. Only Y or N please" );}}