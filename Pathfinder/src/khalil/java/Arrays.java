package khalil.java;

public class Arrays {

    public static void main(String[] args) {

        // Creating an array
        int marks[] = new int[5];

        // Assigning values
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 75;
        marks[3] = 80;
        marks[4] = 95;

        // Displaying array elements
        System.out.println("Student Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }
}
