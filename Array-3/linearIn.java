// Given two arrays of ints sorted in increasing order, outer and inner, return
// true if all of the numbers in inner appear in outer. The best solution makes
// only a single "linear" pass of both arrays, taking advantage of the fact that
// both arrays are already in sorted order.
//
// linearIn([1, 2, 4, 6], [2, 4]) → true
// linearIn([1, 2, 4, 6], [2, 3, 4]) → false
// linearIn([1, 2, 4, 4, 6], [2, 4]) → true
public boolean linearIn(int[] outer, int[] inner) {
  boolean result = true;
  int startIndex = 0;
  for(int i=0;i<inner.length; i++){
    for(int j=startIndex; j<outer.length; j++){
      if(inner[i]==outer[j] && result){
        result = true;
        startIndex = j;
        break;
      } else if (inner[i]!=outer[j] && j==outer.length-1){
        result = false;
        break;
      }
    }
  }
  return result;
}
