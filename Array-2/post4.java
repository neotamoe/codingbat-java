// Given a non-empty array of ints, return a new array containing the elements from
// the original array that come after the last 4 in the original array. The original
// array will contain at least one 4. Note that it is valid in java to create an
// array of length 0.
// 
// post4([2, 4, 1, 2]) → [1, 2]
// post4([4, 1, 4, 2]) → [2]
// post4([4, 4, 1, 2, 3]) → [1, 2, 3]

public int[] post4(int[] nums) {
  int last4 = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==4){
      last4 = i;
    }
  }
  int[] remaining = new int[nums.length-1-last4];
  for(int j=0; j<remaining.length; j++){
    remaining[j]=nums[last4+1];
    last4++;
  }
  return remaining;

}
