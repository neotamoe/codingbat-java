// Given 2 positive int values, return the larger value that is in the range
// 10..20 inclusive, or return 0 if neither is in that range.

// My Solution:
public int max1020(int a, int b) {
  int largest = 0;
  int smallest = 0;
  if (a>b){
    largest = a;
    smallest = b;
  } else if (b>a){
    largest = b;
    smallest = a;
  }
  if(largest<=20 && largest >=10){
    return largest;
  } else if (smallest<=20 && smallest >=10){
    return smallest;
  }
  return 0;
}

// Provided Solution:
public int max1020(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }

  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
