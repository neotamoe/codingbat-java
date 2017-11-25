// Given a string, does "xyz" appear in the middle of the string? To define middle,
// we'll say that the number of chars to the left and right of the "xyz" must differ
// by at most one. This problem is harder than it looks.


public boolean xyzMiddle(String str) {
  boolean result = false;
  for(int i=0; i<str.length()-2; i++){
    if(str.substring(i,i+3).equals("xyz")){
      if(Math.abs((i-0)-(str.length()-(i+3)))<=1){
        result = true;
      }
    }
  }
  return result;
}
