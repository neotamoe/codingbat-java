// Given a string, return a string where every appearance of the lowercase word "is"
// has been replaced with "is not". The word "is" should not be immediately preceeded
// or followed by a letter -- so for example the "is" in "this" does not count.
// (Note: Character.isLetter(char) tests if a char is a letter.)
//
// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"
public String notReplace(String str) {
  String result = "";

  for(int i=0; i<str.length(); i++){
    if(str.charAt(i)=='i' && str.charAt(i+1)=='s' && (i==str.length()-2 || !Character.isLetter(str.charAt(i+2))) && (i==0 || !Character.isLetter(str.charAt(i-1)))){
      result += "is not";
      i++;
    } else {
      result += str.charAt(i);
    }
  }
  return result;
}
