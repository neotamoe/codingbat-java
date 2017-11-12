// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
// so "kittens" yields "kien".

// My Solution:
public String altPairs(String str) {
  String result = "";
  for (int i=0; i<str.length(); i=i+4){
    if(i==str.length()-1){
      result = result + str.charAt(i);
    } else {
      result = result + str.charAt(i) + str.charAt(i+1);
    }
  }
  return result;
}

// Provided Solution:
public String altPairs(String str) {
  String result = "";

  // Run i by 4 to hit 0, 4, 8, ...
  for (int i=0; i<str.length(); i += 4) {
    // Append the chars between i and i+2
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }

  return result;
}
