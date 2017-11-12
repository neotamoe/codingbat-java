// Given 2 strings, a and b, return the number of the positions where they contain
// the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx",
// "aa", and "az" substrings appear in the same place in both strings.

// My Solution:
public int stringMatch(String a, String b) {
  int count = 0;
  int length = Math.min(a.length(), b.length());
  for (int i=0; i<length-1; i++){
      if (a.substring(i,i+2).equals(b.substring(i,i+2))){
        count++;
      }
  }
  return count;
}

// NOTE: I did peek at the provided solution to learn how to easily compare two numbers
// and get the lower number (Math.min(int1,int2)). 
