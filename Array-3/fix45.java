// (This is a slightly harder version of the fix34 problem.) Return an array that
// contains exactly the same numbers as the given array, but rearranged so that
// every 4 is immediately followed by a 5. Do not move the 4's, but every other
// number may move. The array contains the same number of 4's and 5's, and every
// 4 has a number after it that is not a 4. In this version, 5's may appear anywhere
// in the original array.
//
// fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
// fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
// fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]

// My comments: This problem is billed as a "slightly harder version of the fix34 problem."
// My code below is the same as fix34 with numbers swapped (3-->4 and 4-->5)...which means
// my code for fix34 is probably overcomplicated.  :)
public int[] fix45(int[] nums) {
  int[] fooArray = new int[nums.length];
  int [] temp = new int[nums.length];
  int count = 0;
  int fooCount = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==4){
      fooArray[i] = nums[i];
    } else if (nums[i]!=4 && nums[i]!=5){
      temp[count] = nums[i];
      nums[i]= 0;
      count++;
    } else if(nums[i]==5){
      nums[i]=0;
    }
  }
  for(int j=0; j<nums.length; j++){
    if (nums[j]==4){
      fooArray[j+1]=5;
      j++;
    } else if(nums[j]==0){
      fooArray[j] = temp[fooCount];
      fooCount++;
    }
  }

  return fooArray;
}
