package Leetcode;

public class Two_Sum {
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		
		Example:
		
		Given nums = [2, 7, 11, 15], target = 9,
		
		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
	 */
	public static int[] twoSum(int[] nums, int target) {
        //declare an array with size 2
        int [] twoSumArr = new int [2];
        
        //iterate through nums[]
        for(int i = 0; i < nums.length; i++){
            for(int j = (i+1); j < nums.length; j++){
                //check if the 2 indices have to add up to the target
                if((nums[i] + nums[j]) == target){
                    //return the indices
                    twoSumArr[0] = i;
                    twoSumArr[1] = j;
                    return twoSumArr;
                }
            }
        }
        return twoSumArr;
    }
	
	public static void main(String[] args) {
		//testing twoSum()
		int [] arr = {3, 2, 4};
		System.out.println(twoSum(arr, 6));
	}

}
