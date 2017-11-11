// Given a string, return a new string where the first and last chars have been exchanged.

// My Solution:
public String frontBack(String str) {
  if(str.length()<2){
    return str;
  }

  char first = str.charAt(0);
  String middle = str.substring(1,str.length()-1);
  char last = str.charAt(str.length()-1);
  char temp = first;
  first = last;
  last = temp;

  return  first + middle + last;
}

// Provided Solution:
public String frontBack(String str) {
  if (str.length() <= 1) return str;

  String mid = str.substring(1, str.length()-1);

  // last + mid + first
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}
