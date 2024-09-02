package org.learn;

/**
 * There is an integer array nums sorted in ascending order (with distinct
 * values).
 * <p>
 * Prior to being passed to your function, nums is possibly rotated at an
 * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
 * and become [4,5,6,7,0,1,2].
 * <p>
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 Example 2:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1 Example 3:
 * <p>
 * Input: nums = [1], target = 0 Output: -1
 */
public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
        return searchArrayInRotatedArray(nums, 0, nums.length - 1, target);
	}

	private int searchArrayInRotatedArray(int[] nums, int left, int right, int target) {
		if (left >= right) {
			if (nums[left] == target) {
				return left;
			}
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (nums[mid] == target) {
			return mid;
		}else if (nums[left] <= nums[mid]) {
			if (target >= nums[left] && target <nums[mid]) {
				return searchArrayInRotatedArray(nums, left, mid - 1, target);
			} else {
				return searchArrayInRotatedArray(nums, mid + 1, right, target);
			}
		} else {
			if (target > nums[mid] && target <=nums[right]) {
				return searchArrayInRotatedArray(nums, mid + 1, right, target);
			} else {
				return searchArrayInRotatedArray(nums, left, mid - 1, target);
			}
		}
	}
}
