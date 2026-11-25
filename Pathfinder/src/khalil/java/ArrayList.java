package khalil.java;

public class ArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList
        java.util.ArrayList<Integer> numbers =
                new java.util.ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying elements
        System.out.println("ArrayList Elements:");
        System.out.println(numbers);
    }
}