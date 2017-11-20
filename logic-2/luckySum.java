// Given 3 int values, a b c, return their sum. However, if one of the values is 13
// then it does not count towards the sum and values to its right do not count. So for
// example, if b is 13, then both b and c do not count.

public int luckySum(int a, int b, int c) {
  int sum = 0;
  if (a!=13 && b!=13 && c!=13){
    sum = a + b + c;
  } else if (a==13){
    sum = 0;
  } else if (b==13){
    sum = a;
  } else if (c==13){
    sum = a + b;
  }
  return sum;
}
