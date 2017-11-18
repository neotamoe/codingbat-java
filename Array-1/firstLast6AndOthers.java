// Given an array of ints, return true if 6 appears as either the first or last
// element in the array. The array will be length 1 or more.
public boolean firstLast6(int[] nums) {
  int length = nums.length;
  return (nums[0]==6 || nums[length-1]==6);
}

// Given an array of ints, return true if the array is length 1 or more, and the first
// element and the last element are equal.
public boolean sameFirstLast(int[] nums) {
  int length = nums.length;
  return (length>0 && nums[0]==nums[length-1]);
}

// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
public int[] makePi() {
  int[] pie = {3,1,4};
  return pie;
}

// Given 2 arrays of ints, a and b, return true if they have the same first element
// or they have the same last element. Both arrays will be length 1 or more.
public boolean commonEnd(int[] a, int[] b) {
  int aLength = a.length;
  int bLength = b.length;
  return (a[0]==b[0] || a[aLength-1]==b[bLength-1]);
}

// Given an array of ints length 3, return the sum of all the elements.
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

// Given an array of ints length 3, return an array with the elements "rotated left"
// so {1, 2, 3} yields {2, 3, 1}.
public int[] rotateLeft3(int[] nums) {
  int[] numsShifted = {nums[1], nums[2], nums[0]};
  return numsShifted;
}

// Given an array of ints length 3, return a new array with the elements in reverse order,
// so {1, 2, 3} becomes {3, 2, 1}.
public int[] reverse3(int[] nums) {
  int[] numsReversed = {nums[2], nums[1], nums[0]};
  return numsReversed;
}

// Given an array of ints length 3, figure out which is larger, the first or last
// element in the array, and set all the other elements to be that value. Return the
// changed array.
public int[] maxEnd3(int[] nums) {
  int maxOne = 0;

  if(nums[0]>nums[2]){
    maxOne = nums[0];
  } else {
    maxOne = nums[2];
  }
  int[] max = {maxOne, maxOne, maxOne};
  return max;
}

// Given an array of ints, return the sum of the first 2 elements in the array. If
// the array length is less than 2, just sum up the elements that exist, returning 0
// if the array is length 0.
public int sum2(int[] nums) {
  int result = 0;
  if(nums.length==0){
    result = 0;
  }
  if(nums.length==1){
    result = nums[0];
  }
  if(nums.length>1){
    result = nums[0] + nums[1];
  }
  return result;
}

// Given 2 int arrays, a and b, each length 3, return a new array length 2 containing
// their middle elements.
public int[] middleWay(int[] a, int[] b) {
  int[] combined = {a[1], b[1]};
  return combined;
}

// Given an array of ints, return a new array length 2 containing the first and last
// elements from the original array. The original array will be length 1 or more.
public int[] makeEnds(int[] nums) {
  int first = 0;
  int last = 0;

  if (nums.length==1){
    first = nums[0];
    last = nums[0];
  } else {
    first = nums[0];
    last = nums[nums.length-1];
  }
  int[] combined = {first, last};
  return combined;
}

// Given an int array length 2, return true if it contains a 2 or a 3.
public boolean has23(int[] nums) {
  return (nums[0]==2 || nums[0]==3 || nums[1]==2 || nums[1]==3);
}

// Given an int array length 2, return true if it does not contain a 2 or 3.
public boolean no23(int[] nums) {
  return (nums[0]!=2 && nums[0]!=3 && nums[1]!=2 && nums[1]!=3);
}

// Given an int array, return a new array with double the length where its last
// element is the same as the original array, and all the other elements are 0. The
// original array will be length 1 or more. Note: by default, a new int array contains
// all 0's.
public int[] makeLast(int[] nums) {
  int length = nums.length;
  int last = nums[length-1];
  int[] newArray = new int[length*2];

  newArray[(nums.length*2)-1] = last;

  for (int i=0; i<((nums.length*2)-2); i++) {
    newArray[i] = 0;
  }
  return newArray;

}

// Given an int array, return true if the array contains 2 twice, or 3 twice. The
// array will be length 0, 1, or 2.
public boolean double23(int[] nums) {
  Boolean result = false;
  if(nums.length==0 || nums.length==1){
    result = false;
  } else if (nums.length==2){
    if ((nums[0]==2 || nums[0]==3) && (nums[1]==nums[0])){
      result = true;
    }
  }
  return result;
}

// Given an int array length 3, if there is a 2 in the array immediately followed by
// a 3, set the 3 element to 0. Return the changed array.
public int[] fix23(int[] nums) {
  int[] changed = new int[3];

  if (nums[0]==2 && nums[1]==3){
    changed[0]=nums[0];
    changed[1]=0;
    changed[2]=nums[2];
  } else if (nums[1]==2 && nums[2]==3) {
    changed[0]=nums[0];
    changed[1]=nums[1];
    changed[2]=0;
  } else {
    changed[0]=nums[0];
    changed[1]=nums[1];
    changed[2]=nums[2];
  }

  return changed;
}