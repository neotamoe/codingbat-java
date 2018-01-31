// Write a method that converts all strings in a list to their upper case.

public List<String> upperCase(List<String> list) {
  return list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
}
