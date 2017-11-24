// Given a string and a non-empty word string, return a version of the original
// String where all chars have been replaced by pluses ("+"), except for appearances
// of the word string which are preserved unchanged.


public String plusOut(String str, String word) {
  String result = "";
  int wordLength = word.length();
  for (int i=0; i<str.length(); i++){

    if((i+wordLength) > str.length()){
      result += "+";
    } else if (str.substring(i,i+wordLength).equals(word)){
      result += str.substring(i,i+wordLength);
      i+=(wordLength-1);
    } else {
      result += "+";
    }
  }
  return result;

}
