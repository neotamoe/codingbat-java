// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true


public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  boolean result = false;

  for (int i=0; i<str.length(); i++){
    if(i<str.length()-2 && str.substring(i,i+2).equals("is")){
      isCount++;
    } else if (i<str.length()-3 && str.substring(i,i+3).equals("not")){
      notCount++;
    } else if (str.substring(i).equals("is")){
      isCount++;
    } else if (str.substring(i).equals("not")){
      notCount++;
    }
  }
  if(isCount==notCount){
    result = true;
  }
  return result;
}
