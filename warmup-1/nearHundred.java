// Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
// computes the absolute value of a number.

// My solution:
public boolean nearHundred(int n) {
  int aDiff = Math.abs(100-n);
  int bDiff = Math.abs(200-n);
  return (aDiff <= 10 || bDiff <= 10);
}

// Provided Solution:
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}
