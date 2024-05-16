import java.util.Arrays;

public class TwoPointerSumPair {
    public static void findPair(int[] array, int targetSum) {
        // Sort the array
        Arrays.sort(array);

        // Initialize two pointers, one at the beginning and one at the end
        int left = 0;
        int right = array.length - 1;

        // Iterate until pointers meet
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                System.out.println("Pair found: " + array[left] + ", " + array[right]);
                return; // Found the pair, so exit the method
            } else if (currentSum < targetSum) {
                // If current sum is less than target, move left pointer to the right
                left++;
            } else {
                // If current sum is greater than target, move right pointer to the left
                right--;
            }
        }

        // If no pair is found
        System.out.println("No pair found that sums up to " + targetSum);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 8, 10};
        int targetSum = 10;
        findPair(array, targetSum);
    }
}
