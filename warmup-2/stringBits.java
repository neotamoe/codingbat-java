// Given a string, return a new string made of every other char starting with
// the first, so "Hello" yields "Hlo".

// My Solution:
public String stringBits(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++){
    if(i%2==0){
      result += str.charAt(i);
    }
  }
  return result;
}

// Provided Solution:
public String stringBits(String str) {
  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;
}
