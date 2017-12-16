// Return the sum of the numbers in the array, except ignore sections of numbers
// starting with a 6 and extending to the next 7 (every 6 will be followed by at
// least one 7). Return 0 for no numbers.
//
// sum67([1, 2, 2]) → 5
// sum67([1, 2, 2, 6, 99, 99, 7]) → 5
// sum67([1, 1, 6, 7, 2]) → 4

// My comments: I did this one entirely on one pass!  (Most exercises I run the
// tests at least once and make code changes before getting all the tests to pass.)

public int sum67(int[] nums) {
  int sum = 0;
  if(nums.length==0){
    sum = 0;
  } else {
    for(int i=0; i<nums.length; i++){
      if(nums[i]!=6){
        sum += nums[i];
      } else {
        for (int j=i; j<nums.length; j++){
          if(nums[j]!=7){
            continue;
          } else {
            i=j;
            break;
          }
        }
      }
    }
  }
  return sum;
}
