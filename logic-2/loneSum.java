// Given 3 int values, a b c, return their sum. However, if one of the values is
// the same as another of the values, it does not count towards the sum.
public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a!=b && b!=c && a!=c){
    sum = a + b + c;
  } else if (a==b && b!=c){
    sum = c;
  } else if (a==c && a!=b){
    sum = b;
  } else if (a!=b && b==c){
    sum = a;
  }
  return sum;
}
