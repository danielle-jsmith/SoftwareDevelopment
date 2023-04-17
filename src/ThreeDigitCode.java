public class ThreeDigitCode {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 4; i++) { // displaying the first digit
            for(int j = 1; j <= 4; j++) { // displaying the second digit
                for(int k = 1; k <= 4; k++) { // displaying the third digit

                    // Use an if statement to eliminate duplicates
                    if (i!=j && j!=k && i!=k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }
        System.out.println("We have " +count+ " unique numbers");
    }
}