// Return true if the string "cat" and "dog" appear the same number of times in
// the given string.


public boolean catDog(String str) {
  int countDog = 0;
  int countCat = 0;
  boolean result = false;
  for(int i=0; i<str.length()-2; i++){
    if(str.substring(i,i+3).equals("cat")){
      countCat++;
    } else if (str.substring(i,i+3).equals("dog")){
      countDog++;
    }
  }
  if (countCat==countDog){
    result = true;
  }
  return result;
}
