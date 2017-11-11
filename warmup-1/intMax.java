// Given three int values, a b c, return the largest.

// My Solution:
public int intMax(int a, int b, int c) {
  int largest=0;
  if(a>=b && a>=c){
    largest = a;
  } else if(a>=b && a<=c){
    largest = c;
  } else if(a<b && b>=c){
    largest = b;
  } else if (a<b && b<c){
    largest = c;
  }
  return largest;
}

// Provided Solution:
public int intMax(int a, int b, int c) {
  int max;

  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }

  // Now check between max and c
  if (c > max) {
    max = c;
  }

  return max;

  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}
