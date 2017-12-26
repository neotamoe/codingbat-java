// Given an array of strings, return a new array without the strings that are equal
// to the target string. One approach is to count the occurrences of the target
// string, make a new array of the correct length, and then copy over the correct strings.
// 
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
public String[] wordsWithout(String[] words, String target) {
  int targeted = 0;
  int tracker = 0;
  for(int i=0; i<words.length; i++){
    if(!words[i].equals(target)){
      targeted++;
    }
  }
  String[] targetless = new String[targeted];
    for(int i=0; i<words.length; i++){
    if(!words[i].equals(target)){
      targetless[tracker]=words[i];
      tracker++;
    }
  }
  return targetless;
}
