// Given a string, return the longest substring that appears at both the beginning
// and end of the string without overlapping. For example, sameEnds("abXab") is "ab". 
//
// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"
public String sameEnds(String string) {
  String result = "";
  int end = 0;
  if(string.length()%2==0){
    end = (string.length()/2)+1;
  } else {
    end = (string.length()+1)/2;
  }
  for(int i=0;i<end; i++){
    if(string.substring(0,i).equals(string.substring(string.length()-(i)))){
      result = string.substring(0,i);
    }
  }
  return result;
}
