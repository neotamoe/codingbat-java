// Given an array of ints, return true if every element is a 1 or a 4.
//
// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true

public boolean only14(int[] nums) {
  boolean only1Or4 = true;
  for (int i=0; i<nums.length; i++){
    if(nums[i]==1){
      only1Or4 = true;
    } else if ( nums[i]==4){
      only1Or4 = true;
    } else {
      only1Or4 = false;
      break;
    }
  }
  return only1Or4;
}
