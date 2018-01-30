// Given a list of Strings, write a method that returns a list of all strings
// that start with the letter 'a' (lower case) and have exactly 3 letters.
// TIP: Use Java 8 Lambdas and Streams API's.

public List<String> search(List<String> list) {
  return list.stream()
             .filter(n -> n.length()==3)
             .filter(n -> n.charAt(0)=='a')
             .collect(Collectors.toList());
}
