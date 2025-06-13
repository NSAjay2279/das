class Solution:
    def findMaxConsecutiveOnes(self, nums):
        max_ones = 0  # This will store the maximum count of consecutive 1s
        ones = 0      # This will store the current count of consecutive 1s
        
        # Traverse through each element in the array
        for i in range(len(nums)):
            if nums[i] == 1:
                # If we find a 1, increment the consecutive count
                ones += 1
            else:
                # If we find a 0, update max_ones and reset ones to 0
                max_ones = max(max_ones, ones)
                ones = 0
        
        # Final update for the case where the array ends with 1s
        return max(max_ones, ones)

def main():
    # Create a Solution object
    sol = Solution()
    
    # Example 1
    nums1 = [1, 1, 0, 1, 1, 1]
    output1 = sol.findMaxConsecutiveOnes(nums1)
    print(f"The maximum number of consecutive 1s in {nums1} is: {output1}")  # Expected output: 3
    
    # Additional Test Cases
    # Case 2: Only 0's in the array
    nums2 = [0, 0, 0, 0]
    output2 = sol.findMaxConsecutiveOnes(nums2)
    print(f"The maximum number of consecutive 1s in {nums2} is: {output2}")  # Expected output: 0
    
    # Case 3: Only 1's in the array
    nums3 = [1, 1, 1, 1, 1]
    output3 = sol.findMaxConsecutiveOnes(nums3)
    print(f"The maximum number of consecutive 1s in {nums3} is: {output3}")  # Expected output: 5
    
    # Case 4: Alternating 1's and 0's
    nums4 = [1, 0, 1, 0, 1]
    output4 = sol.findMaxConsecutiveOnes(nums4)
    print(f"The maximum number of consecutive 1s in {nums4} is: {output4}")  # Expected output: 1
    
    # Case 5: Array with multiple streaks of consecutive 1s
    nums5 = [1, 1, 0, 1, 1, 1, 0, 1]
    output5 = sol.findMaxConsecutiveOnes(nums5)
    print(f"The maximum number of consecutive 1s in {nums5} is: {output5}")  # Expected output: 3

main()
