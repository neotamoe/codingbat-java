// Given a non-empty string and an int n, return a new string where the char at
// index n has been removed. The value of n will be a valid index of a char in
// the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

// My Solution:
public String missingChar(String str, int n) {
  String newString = "";
  for(int i=0; i<str.length(); i++){
    if(i==n){
      newString = newString;
    } else {
      newString = newString + str.charAt(i);
    }
  }
  return newString;
}

// Provided Solution:
public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  
  // Start this substring at n+1 to omit the char.
  // Can also be shortened to just str.substring(n+1)
  // which goes through the end of the string.
  String back = str.substring(n+1, str.length());

  return front + back;
}
