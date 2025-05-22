import java.util.Arrays;

public class moveZero {
    // Method to move all zeros to the end
    public static void moveZeros(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 0, 5, 0};
        moveZeros(nums); // Call method to rearrange the array
        System.out.println(Arrays.toString(nums)); // Print updated array
    }
}
