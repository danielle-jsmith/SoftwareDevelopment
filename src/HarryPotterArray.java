public class HarryPotterArray {
    public static void main(String[] args) {
        // array = collection of the same data type
        // initialise the array and put all data inside
        String [] fNames = {"Harry", "Ron", "Draco", "Ginny", "Neville"};
        // print each data using the index number - 0, 1, 2
        System.out.println(fNames[0]); // outputs Harry
        System.out.println(fNames[1]); // outputs Ron
        System.out.println(fNames[2]); // outputs Draco

        // find the length of the array
        System.out.println("The array length is " + fNames.length);

        // automate and display all data inside the array using a for loop
        for (int index = 0; index < fNames.length; index++) {
            System.out.println(fNames[index]);
        }

    }
}
