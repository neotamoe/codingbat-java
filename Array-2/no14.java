// Given an array of ints, return true if it contains no 1's
// or it contains no 4's.
//
// no14([1, 2, 3]) → true
// no14([1, 2, 3, 4]) → false
// no14([2, 3, 4]) → true

public boolean no14(int[] nums) {
  boolean has1 = false;
  boolean has4 = false;
  boolean result = false;
  for (int i=0; i<nums.length; i++){
    if(nums[i]==1){
      has1 = true;
    } else if (nums[i]==4){
      has4 = true;
    }
  }
  if(has1 && has4){
    result = false;
  } else if (has1 || has4){
    result = true;
  } else {
    result = true;
  }
  return result;
}
