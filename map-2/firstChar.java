// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
//
// firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
// firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
// firstChar([]) → {}

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();

  for(int i=0; i<strings.length; i++){
    if(!map.containsKey(strings[i].substring(0,1))){
      map.put(strings[i].substring(0,1),strings[i]);
    } else {
      String temp = map.get(strings[i].substring(0,1));
      map.put(strings[i].substring(0,1), temp + strings[i]);
    }
  }
  return map;
}
