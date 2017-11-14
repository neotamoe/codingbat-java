// Given a string, return a string length 2 made of its first 2 chars. If the string
// length is less than 2, use '@' for the missing chars.
public String atFirst(String str) {
  if (str.length()<1){
    return "@@";
  } else if(str.length()==1){
    return str.substring(0) + "@";
  } else{
    return str.substring(0,2);
  }
}

// Given 2 strings, a and b, return a new string made of the first char of a and the
// last char of b, so "yo" and "java" yields "ya". If either string is length 0,
// use '@' for its missing char.
public String lastChars(String a, String b) {
  String first = "";
  String last = "";
  if(a.length()==0){
    first = "@";
  } else {
    first = a.substring(0,1);
  }
  if(b.length()==0){
    last = "@";
  } else {
    last = b.substring(b.length()-1);
  }
  return first + last;
}

//Given two strings, append them together (known as "concatenation") and return the
// result. However, if the concatenation creates a double-char, then omit one of
// the chars, so "abc" and "cat" yields "abcat".
public String conCat(String a, String b) {
  String result = "";

  if(a.length()>0 && b.length()>0 && a.substring(a.length()-1).equals(b.substring(0,1))){
    result = a.substring(0,a.length()-1) + b;
  } else {
    result = a + b;
  }
  return result;
}

// Given a string of any length, return a new string where the last 2 chars, if present,
//  are swapped, so "coding" yields "codign".
public String lastTwo(String str) {
  String end = "";
  String second = "";
  String result = "";
  if(str.length()>=2){
    second = str.substring(str.length()-2,str.length()-1);
    end = str.substring(str.length()-1);
    result = str.substring(0,str.length()-2) + end + second;
  } else {
    result = str;
  }
  return result;
}

// Given a string, return true if the first 2 chars in the string also appear at the
// end of the string, such as with "edited".
public boolean frontAgain(String str) {
  if(str.length()<2){
    return false;
  }
  if(str.substring(0,2).equals(str.substring(str.length()-2))){
    return true;
  }
  return false;
}

// Given a string, return a new string made of 3 copies of the first 2 chars of the
// original string. The string may be any length. If there are fewer than 2 chars,
// use whatever is there.
public String extraFront(String str) {
  String front = "";

  if(str.length()<2){
    front = str;
  } else {
    front = str.substring(0,2);
  }
  return front + front + front;
}

// Given a string, if a length 2 substring appears at both its beginning and end,
// return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
// The substring may overlap with itself, so "Hi" yields "". Otherwise, return the
// original string unchanged.
public String without2(String str) {
  String result = "";
  if(str.length()<=1){
    result = str;
  } else if(str.substring(0,2).equals(str.substring(str.length()-2))){
    result = (str.substring(2));
  } else if (str.length()==2) {
    if(str.charAt(0)==str.charAt(1)){
      result = "";
    } else {
      result = str;
    }
  } else {
    result = str;
  }
  return result;
}

// Given a string, return a version without the first 2 chars. Except keep the first
// char if it is 'a' and keep the second char if it is 'b'. The string may be any
// length. Harder than it looks.
public String deFront(String str) {
  String result = "";
  if(str.charAt(0)=='a' && str.charAt(1)=='b'){
    result = str;
  } else if(str.charAt(0)=='a'){
    result = str.substring(0,1) + str.substring(2);
  } else if (str.charAt(1)=='b'){
    result = str.substring(1);
  } else {
    result = str.substring(2);
  }
  return result;
}
