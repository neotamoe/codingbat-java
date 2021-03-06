// Count the number of "xx" in the given string. We'll say that overlapping is
// allowed, so "xxx" contains 2 "xx".

// My Solution:
int countXX(String str) {
  int count = 0;
  for (int i=0; i<str.length()-1; i++){
    if(str.charAt(i)=='x' && str.charAt(i+1)=='x') {
      count ++;
    }
  }
  return count;
}

// Provided Solution:
int countXX(String str) {
  int count = 0;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.substring(i, i+2).equals("xx")) count++;
  }
  return count;
}

// Solution notes: the loop is shortened to end at str.length()-1
// so we can pull out a length 2 substring without going out of bounds.
// Remember to use equals() to compare strings, not ==.
