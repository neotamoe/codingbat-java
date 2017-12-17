// Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
//
// modThree([2, 1, 3, 5]) → true
// modThree([2, 1, 2, 5]) → false
// modThree([2, 4, 2, 5]) → true

// My comments: I think this could be done much more efficiently, but I am not reworking it
// at this time.  This is what I did on my first pass through to get all tests to pass.

public boolean modThree(int[] nums) {
  int has3even = 0;
  int has3odd = 0;
  boolean firstEven = false;
  boolean firstOdd = false;
  for(int i=0; i<nums.length; i++){
    if(i==0 && nums[i]%2==0){
      has3even++;
      firstEven = true;
    } else if (i==0 && nums[i]%2!=0){
      has3odd++;
      firstOdd = true;
    } else if (firstEven && nums[i]%2==0 && nums[i-1]%2==0){
      has3even++;
    } else if (firstOdd && nums[i]%2!=0 && nums[i-1]%2!=0){
      has3odd++;
    } else if (has3even==0 && nums[i]%2==0){
      has3even++;
      firstEven = true;
    } else if (has3odd==0 && nums[i]%2!=0){
      has3odd++;
      firstOdd = true;
    }
  }
  return (has3even==3 || has3odd==3);
}
