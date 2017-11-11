// Return true if the given string contains between 1 and 3 'e' chars.

public boolean stringE(String str) {
  int count = 0;
  for(int i=0; i<str.length(); i=i+1){
    if (str.substring(i,i+1).equals("e")){
      count++;
    }
  }
  return (count>0 && count<4);
}
