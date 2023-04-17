public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = 2 * circleRadius;
        double circleCircumference = 2 * 3.14 * circleRadius;
        double circleArea = Math.round(3.14 * circleRadius * circleRadius *100)/100;
        System.out.println("Circle radius is " + circleRadius);
        System.out.println("Circle diameter is " + circleDiameter);
        System.out.println("Circle circumference is " + circleCircumference);
        System.out.println("Circle area is " + circleArea);
    }
}
