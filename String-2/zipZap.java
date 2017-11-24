// Look for patterns like "zip" and "zap" in the string -- length-3, starting with
// 'z' and ending with 'p'. Return a string where for all such words, the middle
// letter is gone, so "zipXzap" yields "zpXzp".


public String zipZap(String str) {
  String result = "";
  if(str.length()<3){
    result = str;
  } else {
    for (int i=0; i<str.length(); i++){
      if(str.substring(i,i+1).equals("z") && str.substring(i+2, i+3).equals("p")){
        result += str.substring(i,i+1) + str.substring(i+2,i+3);
        i+=2;
      } else {
        result += str.substring(i,i+1);
      }
    }
  }
  return result;
}
