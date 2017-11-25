// Given an array length 1 or more of ints, return the difference between the
// largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
// and Math.max(v1, v2) methods return the smaller or larger of two values.


public int bigDiff(int[] nums) {
  int largest = 0;
  int smallest = nums[0];
  int difference = 0;
  for (int i=0; i<nums.length; i++){
    if(smallest<= Math.min(nums[i],smallest)){
     smallest = smallest;
    } else {
      smallest = Math.min(nums[i], smallest);
    }
    if(largest>= Math.max(nums[i],largest)){
      largest = largest;
    } else {
      largest = Math.max(nums[i],largest);
    }
    difference = Math.abs(largest-smallest);
  }
  return difference;
}
