// Given two strings, a and b, create a bigger string made of the first char of a,
// the first char of b, the second char of a, the second char of b, and so on. Any
// leftover chars go at the end of the result.


public String mixString(String a, String b) {
  String newString = "";
  int longer = a.length()>b.length() ? a.length() : b.length();
  for(int i=0; i<longer; i++){
    if(i<a.length()){
     newString+= a.substring(i,i+1);
    } else if (i==a.length()-1){
      newString+=a.substring(i);
    }
    if(i<b.length()){
     newString+= b.substring(i,i+1);
    } else if (i==b.length()-1){
      newString+=b.substring(i);
    }
  }
  return newString;
}
