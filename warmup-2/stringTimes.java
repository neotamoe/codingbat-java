// Given a string and a non-negative int n, return a larger string that is n copies of the original string.

// My Solution:
public String stringTimes(String str, int n) {
  String newString ="";
  for(int i=0; i<n; i++){
    newString += str;
  }
  return newString;
}
