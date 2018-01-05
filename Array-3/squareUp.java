// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
//
// squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
// squareUp(2) → [0, 1, 2, 1]
// squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

public int[] squareUp(int n) {
  int[] newSquareUp = new int[n*n];
  int count = 1;
  int max = n;
  for(int i=newSquareUp.length-1; i>=0; i--){
    if(count==n+1){
      count = 1;
      max--;
    }
    if(count>max){
      count++;
      continue;
    } else {
      newSquareUp[i]=count;
      count++;
    }
  }

  return newSquareUp;
}
