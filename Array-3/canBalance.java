// Given a non-empty array, return true if there is a place to split the array so
// that the sum of the numbers on one side is equal to the sum of the numbers on
// the other side.
//
// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([10, 10]) → true

public boolean canBalance(int[] nums) {
  int sumFront = 0;
  int sumBack = 0;

  for(int i=0; i<nums.length; i++){
    sumFront += nums[i];
    for(int j=nums.length-1; j>i; j--){
      if(j==nums.length-1){
        sumBack = 0;
      }
      sumBack += nums[j];
      if(sumFront==sumBack && i==j-1){
        return true;
      }
    }
  }
  return false;
}
