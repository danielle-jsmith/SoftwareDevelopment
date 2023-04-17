// nested loops are a loop inside another loop
// you must use a different counter name for each loop
// try to print number 10 - 99
public class NestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.println(i + "" + j);
            }
    }
} }
