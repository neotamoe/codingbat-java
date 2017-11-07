// Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings.

// my solution:
public String notString(String str) {
  String not = "not";
  String first = "";
  if (str.length() > 3){
    for (int i=0; i < 3; i++) {
      first += str.charAt(i);
    }
  } else {
    for (int i=0; i<str.length(); i++){
      first += str.charAt(i);
    }
  }
  if (first.equals(not)) {
    return str;
  } else {
    return not + " " + str;
  }
}


// Provided (and obviously much better) Solution:
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }

  return "not " + str;
}
