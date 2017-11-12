// Given a string, return true if the first instance of "x" in the
// string is immediately followed by another "x".

// My Solution:
boolean doubleX(String str) {
  boolean answer = false;
  boolean first = false;
  if (str.length()<2){
    return answer = false;
  }
  for (int i=0; i<str.length()-1; i++){
   if(str.charAt(i)=='x'){
     if(str.charAt(i+1)=='x' && first==false){
       first = true;
       return answer = true;
     }
     return answer;
   }
  }
  return answer;
}

// Provided Solution:
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; // no "x" at all

  // Is char at i+1 also an "x"?
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");

  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");
}
