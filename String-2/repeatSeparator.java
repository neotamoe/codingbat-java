// Given two strings, word and a separator sep, return a big string made of count
// occurrences of the word, separated by the separator string.

public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  for (int i=0; i<count; i++){
    result += word;
    if(i<count-1){
      result += sep;
    }
  }
  return result;
}
