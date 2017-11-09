// Given a string, take the first 2 chars and return the string with the 2 chars
// added at both the front and back, so "kitten" yields"kikittenki". If the string
// length is less than 2, use whatever chars are there.

// My Solution:
public String front22(String str) {
  String firstTwo = "";
  if(str.length()>2){
    firstTwo = str.substring(0,2);
  } else {
    firstTwo = str;
  }
  return firstTwo + str + firstTwo;
}

// Provided Solution:
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }

  String front = str.substring(0, take);
  return front + str + front;
}
