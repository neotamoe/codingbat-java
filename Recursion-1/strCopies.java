// Given a string and a non-empty substring sub, compute recursively if at least n
// copies of sub appear in the string somewhere, possibly with overlapping. N will be
// non-negative.
// 
// strCopies("catcowcat", "cat", 2) → true
// strCopies("catcowcat", "cow", 2) → false
// strCopies("catcowcat", "cow", 1) → true

public boolean strCopies(String str, String sub, int n) {
  int subLength = sub.length();
  if(n==0){ return true; }
  if(str.length()<subLength){ return false; }
  if(str.substring(0,subLength).equals(sub)){
    return strCopies(str.substring(1),sub,n-=1);
  }
  return strCopies(str.substring(1),sub,n);
}
