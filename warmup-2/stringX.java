// Given a string, return a version where all the "x" have been removed. Except
// an "x" at the very start or end should not be removed.

// My Solution:
public String stringX(String str) {
  if (str.length()<2) return str;

  String middle = "";
  for(int i=1; i<str.length()-1; i++){
    if(str.charAt(i) != 'x'){
      middle += str.charAt(i);
    }
  }
  return str.charAt(0) + middle + str.charAt(str.length()-1);
}
