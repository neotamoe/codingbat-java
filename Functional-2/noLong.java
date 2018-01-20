// Given a list of strings, return a list of the strings, omitting any string
// length 4 or more.
//
// noLong(["this", "not", "too", "long"]) → ["not", "too"]
// noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
// noLong(["cccc", "cccc", "cccc"]) → []

public List<String> noLong(List<String> strings) {
  strings.removeIf(n -> n.length()>=4);
  return strings;
}
