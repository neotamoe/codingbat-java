// Given three ints, a b c, return true if one of b or c is "close" (differing from a
// by at most 1), while the other is "far", differing from both other values by 2 or
// more. Note: Math.abs(num) computes the absolute value of a number.

public boolean closeFar(int a, int b, int c) {
  Boolean result = false;
  if(distance(a,b)<=1 && distance(a,c)>=2 && distance(c,b)>=2){
    result = true;
  } else if (distance(a,c)<=1 && distance(a,b)>=2 && distance(c,b)>=2){
    result = true;
  }
  return result;
}

public int distance(int numA, int numOther){
  return Math.abs(numA-numOther);
}
