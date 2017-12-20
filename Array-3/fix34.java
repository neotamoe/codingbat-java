// Return an array that contains exactly the same numbers as the given array, but
// rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
// but every other number may move. The array contains the same number of 3's and 4's,
// every 3 has a number after it that is not a 3, and a 3 appears in the array before
// any 4.
// 
// fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
// fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
// fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
public int[] fix34(int[] nums) {
  int[] fooArray = new int[nums.length];
  int [] temp = new int[nums.length];
  int count = 0;
  int fooCount = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==3){
      fooArray[i] = nums[i];
    } else if (nums[i]!=3 && nums[i]!=4){
      temp[count] = nums[i];
      nums[i]= 0;
      count++;
    } else if(nums[i]==4){
      nums[i]=0;
    }
  }
  for(int j=0; j<nums.length; j++){
    if (nums[j]==3){
      fooArray[j+1]=4;
      j++;
    } else if(nums[j]==0){
      fooArray[j] = temp[fooCount];
      fooCount++;
    }
  }

  return fooArray;
}
