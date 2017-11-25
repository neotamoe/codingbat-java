// A sandwich is two pieces of bread with something in between. Return the string
// that is between the first and last appearance of "bread" in the given string,
// or return the empty string "" if there are not two pieces of bread.


public String getSandwich(String str) {
  int jamStart = 0;
  int jamEnd = 0;
  int breadCount = 0;
  String jam = "";
  for (int i=0; i<str.length()-4; i++){
    if(str.substring(i,i+5).equals("bread")){
      breadCount++;
      if(breadCount==1){
        jamStart = i+5;
      } else {
        jamEnd = i;
      }
    }
  }
  if(jamStart!=0 && jamEnd!=0){
    jam = str.substring(jamStart,jamEnd);
  }
  return jam;
}
