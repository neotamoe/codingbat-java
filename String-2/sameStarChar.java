// Returns true if for every '*' (star) in the string, if there are chars both
// immediately before and after the star, they are the same.

// My Solution:
public boolean sameStarChar(String str) {
  boolean result = false;
  int starCount = 0;
  if(str.length()<3){
    result = false;
  } else {
    for (int i=1; i<str.length()-1; i++){
      if(str.substring(i,i+1).equals("*")){
        starCount++;
        if(str.substring(i-1,i).equals(str.substring(i+1,i+2))){
          result = true;
        } else {
          result = false;
        }
      }
    }
  }
  if(starCount==0){
    result = true;
  }
  return result;
}

// Provided Solution:
public boolean sameStarChar(String str) {
  for (int i=1; i<str.length()-1; i++) {
    if (str.charAt(i) == '*') {
      if (str.charAt(i-1) != str.charAt(i+1)) return false;
    }
  }
  return true;

  // Solution notes: loop through the chars 1..len-2 (that is,
  // skip over the first and last chars). Each time that the char
  // is '*', check that the chars before and after it are equal. If they
  // are not, return false immediately.
}
