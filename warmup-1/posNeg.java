// Given 2 int values, return true if one is negative and one is positive. Except
// if the parameter "negative" is true, then return true only if both are negative.

// My solution:
public boolean posNeg(int a, int b, boolean negative) {
  if (negative && (a<0 && b<0)) {
    return true;
  }
  return (!negative && ((a>0 && b<0) || (a<0 && b>0)));
}

// Provided Solution:
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}
