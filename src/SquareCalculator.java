import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter width = ");
        double width = reader.nextDouble();
        System.out.println("Please enter height = ");
        double height = reader.nextDouble();

        System.out.println("Width is " + width);
        System.out.println("Height is " + height);

        double perimeter = (2 * width) + (2 * height);
        System.out.println("Perimeter is " + perimeter);

        double area = width * height;
        System.out.println("Area is " + area);
        System.out.println();
        ;

    }
}
