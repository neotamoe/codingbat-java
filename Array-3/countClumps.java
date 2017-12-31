// Say that a "clump" in an array is a series of 2 or more adjacent elements of
// the same value. Return the number of clumps in the given array.
//
//
// countClumps([1, 2, 2, 3, 4, 4]) → 2
// countClumps([1, 1, 2, 1, 1]) → 2
// countClumps([1, 1, 1, 1, 1]) → 1

public int countClumps(int[] nums) {
  int clump = 0;
  int temp = -1;
  for(int i=0; i<nums.length-1; i++){
    if(nums[i]==nums[i+1] && temp!=nums[i]){
      clump++;
      temp = nums[i];
    } else if (nums[i]==nums[i+1] && temp==nums[i]){
      continue;
    } else {
      temp = nums[i];
    }
  }
  return clump;
}
