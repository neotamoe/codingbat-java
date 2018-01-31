// Write a method that returns the average of a list of integers.

public Double average(List<Integer> list) {
  return list.stream().mapToDouble(i -> i).sum() / list.size();
}
