package khalil.java;

public class Lab1SearchingProgram 
{
    // Linear Search
    public static int linearSearch(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) 
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] sizes = {1000, 10000, 100000, 1000000};

        System.out.println("Array Size\tLinear Time(ns)\tBinary Time(ns)");

        for(int n : sizes) 
        {
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            int target = n;

            // Linear Search Time
            long start = System.nanoTime();

            int linearResult = linearSearch(arr, target);

            long end = System.nanoTime();

            long linearTime = end - start;

            // Binary Search Time
            start = System.nanoTime();

            int binaryResult = binarySearch(arr, target);

            end = System.nanoTime();

            long binaryTime = end - start;

            // Display Results
            System.out.println("Array Size: " + n);
            System.out.println("Linear Search Index: " + linearResult);
            System.out.println("Binary Search Index: " + binaryResult);
            System.out.println("Linear Time: " + linearTime + " ns");
            System.out.println("Binary Time: " + binaryTime + " ns");
            System.out.println("--------------------------------");
        }
    }
}