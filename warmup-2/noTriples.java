//Given an array of ints, we'll say that a triple is a value appearing 3 times in
// a row in the array. Return true if the array does not contain any triples.

// My Solution:
public boolean noTriples(int[] nums) {
  boolean noTriples = true;

  for (int i=0; i<nums.length-2; i++){
    if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
      noTriples = false;
    }
  }
  return noTriples;
}

// Provided Solution:
public boolean noTriples(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return false immediately if every seeing a triple.
  for (int i=0; i < (nums.length-2); i++) {
    int first = nums[i];
    if (nums[i+1]==first && nums[i+2]==first) return false;
  }

  // If we get here ... no triples.
  return true;
}