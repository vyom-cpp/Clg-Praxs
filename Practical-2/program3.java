import java.util.HashSet;

public class program3 {
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0]; // Return an empty array if input array is empty or null
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num); // Add each element to a HashSet (duplicates will be automatically removed)
        }

        // Create a new array to store the unique elements
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num; // Copy elements from HashSet to the new array
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 6, 4};
        int[] uniqueArray = removeDuplicates(array);

        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
