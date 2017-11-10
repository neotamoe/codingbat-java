// Given a string, if the string "del" appears starting at index 1, return a
// string where that "del" has been deleted. Otherwise, return the string unchanged.

// My Solution:
public String delDel(String str) {
  String first = "";
  String end = "";
  if(str.length()<4) {
    return str;
  } else if(str.substring(1,4).equals("del")){
    first = str.substring(0,1);
    end = str.substring(4);
    return first + end;
  } else {
    return str;
  }
}

// Provided Solution:
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}
