// Given an array of ints, return true if one of the first 4 elements in the array
// is a 9. The array length may be less than 4.

// My Solution:
public boolean arrayFront9(int[] nums) {
  boolean found = false;
  int end = 4;
  if (nums.length<4){
    end = nums.length;
  }
  for (int i=0; i<end; i++){
    if(nums[i]==9){
      found = true;
    }
  }
  return found;
}

// Provided Solution:
public boolean arrayFront9(int[] nums) {
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;

  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }

  return false;
}
