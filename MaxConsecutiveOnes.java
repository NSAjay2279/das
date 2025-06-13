import java.util.Arrays;

public class MaxConsecutiveOnes {
    
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxOnes = 0;  // This will store the maximum count of consecutive 1s
            int ones = 0;     // This will store the current count of consecutive 1s
            
            // Traverse through each element in the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    // If we find a 1, increment the consecutive count
                    ones++;
                } else {
                    // If we find a 0, update maxOnes and reset ones to 0
                    maxOnes = Math.max(maxOnes, ones);
                    ones = 0;
                }
            }
            
            // Final update for the case where the array ends with 1s
            return Math.max(maxOnes, ones);
        }
    }
    
    public static void main(String[] args) {
        // Create a Solution object
        Solution sol = new Solution();
        
        // Example 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int output1 = sol.findMaxConsecutiveOnes(nums1);
        System.out.println("The maximum number of consecutive 1s in " + 
                         Arrays.toString(nums1) + " is: " + output1);  // Expected output: 3
        
        // Additional Test Cases
        // Case 2: Only 0's in the array
        int[] nums2 = {0, 0, 0, 0};
        int output2 = sol.findMaxConsecutiveOnes(nums2);
        System.out.println("The maximum number of consecutive 1s in " + 
                         Arrays.toString(nums2) + " is: " + output2);  // Expected output: 0
        
        // Case 3: Only 1's in the array
        int[] nums3 = {1, 1, 1, 1, 1};
        int output3 = sol.findMaxConsecutiveOnes(nums3);
        System.out.println("The maximum number of consecutive 1s in " + 
                         Arrays.toString(nums3) + " is: " + output3);  // Expected output: 5
        
        // Case 4: Alternating 1's and 0's
        int[] nums4 = {1, 0, 1, 0, 1};
        int output4 = sol.findMaxConsecutiveOnes(nums4);
        System.out.println("The maximum number of consecutive 1s in " + 
                         Arrays.toString(nums4) + " is: " + output4);  // Expected output: 1
        
        // Case 5: Array with multiple streaks of consecutive 1s
        int[] nums5 = {1, 1, 0, 1, 1, 1, 0, 1};
        int output5 = sol.findMaxConsecutiveOnes(nums5);
        System.out.println("The maximum number of consecutive 1s in " + 
                         Arrays.toString(nums5) + " is: " + output5);  // Expected output: 3
    }
}
