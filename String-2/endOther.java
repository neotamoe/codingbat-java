// Given two strings, return true if either of the strings appears at the very end of
// the other string, ignoring upper/lower case differences (in other words, the
// computation should not be "case sensitive"). Note: str.toLowerCase() returns the
// lowercase version of a string.

public boolean endOther(String a, String b) {
  String aLower = a.toLowerCase();
  String bLower = b.toLowerCase();
  int aLength = a.length();
  int bLength = b.length();
  boolean result = false;

  if(aLength>bLength){
    if(aLower.substring(aLength-bLength).equals(bLower)){
      result = true;
    }
  } else if (bLength>aLength){
    if (bLower.substring(bLength-aLength).equals(aLower)){
      result = true;
    }
  }
  else {
    if(aLower==bLower){
      result = true;
    }
  }
  return result;
}
