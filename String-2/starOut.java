// Return a version of the given string, where for every star (*) in the string the 
// star and the chars immediately to its left and right are gone. So "ab*cd" yields
// "ad" and "ab**cd" also yields "ad".

public String starOut(String str) {
  String result = "";
  if(str.length()==0){
    result = "";
  } else {
    for(int i=0; i<str.length(); i++){
      if(i>0 && str.charAt(i-1)=='*') {
        continue;
      } else if(str.charAt(i)=='*'){
        continue;
      } else if (i<str.length()-1 && str.charAt(i+1)=='*'){
        continue;
      } else {
        result += str.charAt(i);
      }
    }
  }

  return result;
}
