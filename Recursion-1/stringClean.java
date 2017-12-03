// Given a string, return recursively a "cleaned" string where adjacent chars that
// are the same have been reduced to a single char. So "yyzzza" yields "yza".
//
// stringClean("yyzzza") → "yza"
// stringClean("abbbcdd") → "abcd"
// stringClean("Hello") → "Helo"

public String stringClean(String str) {
  if(str.length()==0) { return str; }
  if(str.length()==1) { return str.substring(0); }

  if(str.charAt(0)==str.charAt(1) && (str.length()<3 ||str.charAt(1)!=str.charAt(2)) ){
    return str.substring(1,2) + stringClean(str.substring(2));
  }

  if(str.charAt(0)==str.charAt(1) && str.charAt(1)==str.charAt(2)) {
      return str.substring(0,1) + stringClean(str.substring(3));
  }

  return str.substring(0,1) + stringClean(str.substring(1));
}
