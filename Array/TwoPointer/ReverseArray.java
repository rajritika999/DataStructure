//Prog to reverse an array using 2-pointers

import java.io.*;

public class //Prog to reverse an array using 2-pointers

import java.io.*;

public class TwoPointer {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse the array using two pointers
    public static void reverseArray(int[] arr) {
        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0;
        int right = arr.length - 1;

        // Continue swapping elements until the pointers meet or cross each other
        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // Move the left pointer to the right
            left++;
            // Move the right pointer to the left
            right--;
        }
    }
} {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse the array using two pointers
    public static void reverseArray(int[] arr) {
        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0;
        int right = arr.length - 1;

        // Continue swapping elements until the pointers meet or cross each other
        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // Move the left pointer to the right
            left++;
            // Move the right pointer to the left
            right--;
        }
    }
}
