// Given a string, consider the prefix string made of the first N chars of the string.
// Does that prefix string appear somewhere else in the string? Assume that the string
// is not empty and that N is in the range 1..str.length().

public boolean prefixAgain(String str, int n) {
  String compare = str.substring(0,n);
  boolean result = false;
  if(str.substring(n).equals(compare)){
      result = true;
  } else {
    for (int i=n; i<str.length()-n; i++){

      if(str.substring(i,i+n).equals(compare)){
        result = true;
      }
    }
  }
  return result;
}
