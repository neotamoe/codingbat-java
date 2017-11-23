// We'll say that a String is xy-balanced if for all the 'x' chars in the string,
// there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
// but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
// string is xy-balanced.

public boolean xyBalance(String str) {
  boolean result = true;
  for(int i=0; i<str.length(); i++){
    if(str.substring(i,i+1).equals("x")){
      result = false;
      for(int j=i; j<str.length(); j++){
        if(str.substring(j,j+1).equals("y")){
          result = true;
          continue;
        }
      }
    }
  }
  return result;
}
