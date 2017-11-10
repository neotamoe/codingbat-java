// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only
// if it is 'z', so "ozymandias" yields "oz".

// My Solution:
public String startOz(String str) {

  String end = "";
  if (str.length()<1){
    end = end;
  } else if (str.length()<2 && str.substring(0,1).equals("o")){
    end = str.substring(0,1);
  } else if(str.substring(0,1).equals("o") && str.substring(1,2).equals("z")){
    end = "oz";
  } else if (str.substring(0,1).equals("o")){
    end = str.substring(0,1);
  } else if (str.substring(1,2).equals("z")){
    end = str.substring(1,2);
  } else {
    end = end;
  }
  return end;
}

// Provided Solution:
public String startOz(String str) {
  String result = "";
  
  if (str.length() >= 1 && str.charAt(0)=='o') {
    result = result + str.charAt(0);
  }

  if (str.length() >= 2 && str.charAt(1)=='z') {
    result = result + str.charAt(1);
  }

  return result;
}
