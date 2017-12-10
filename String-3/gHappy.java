// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
// immediately to its left or right. Return true if all the g's in the given string
// are happy.
//
// gHappy("xxggxx") → true
// gHappy("xxgxx") → false
// gHappy("xxggyygxx") → false

public boolean gHappy(String str) {
  boolean happy = false;
  if(str.length()==1){
    happy = false;
  } else if(str.length()==0){
    happy = true;
  } else if (str.length()==2 && str=="gg"){
    happy = true;
  }else {
    for(int i=0;i<str.length();i++){
      if(str.charAt(str.length()-1)=='g' && str.charAt(str.length()-2)=='g'){
        happy = true;
      } else if (str.charAt(str.length()-1)=='g' && str.charAt(str.length()-2)!='g'){
        happy = false;
      }else if(str.charAt(i)=='g' && (str.charAt(i-1)=='g' || str.charAt(i+1)=='g')){
        happy = true;
      } else if (str.charAt(i)=='g' && (str.charAt(i-1)!='g' || str.charAt(i+1)!='g')){
        happy = false;
      }
    }
  }
  return happy;
}
