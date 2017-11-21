// For this problem, we'll round an int value up to the next multiple of 10 if its
// rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the
// previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to
// 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code
// repetition, write a separate helper "public int round10(int num) {" and call it 3
// times. Write the helper entirely below and at the same indent level as roundSum().

public int roundSum(int a, int b, int c) {
  return (round10(a) + round10(b) + round10(c));
}

public int round10(int num){
  int rounded = 0;
  switch (num%10) {
    case 1:  rounded = num-1;
      break;
    case 2:  rounded = num-2;
      break;
    case 3:  rounded = num-3;
      break;
    case 4:  rounded = num-4;
      break;
    case 5:  rounded = num+5;
      break;
    case 6:  rounded = num+4;
      break;
    case 7:  rounded = num+3;
      break;
    case 8:  rounded = num+2;
      break;
    case 9:  rounded = num+1;
      break;
    case 0: rounded = num;
      break;
  }
  return rounded;
}
