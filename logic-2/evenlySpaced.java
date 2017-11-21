// Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced, so the difference between small
// and medium is the same as the difference between medium and large.

// My comments: 
// This does not seem to be a very elegant solution, and I am sure there is a way to
// refactor into something cleaner and more efficient, but it is what I first wrote.
// ...And it does pass all the tests.
public boolean evenlySpaced(int a, int b, int c) {
  Boolean result = false;
  if(a<b && b<c){
    if(Math.abs(a-b)==Math.abs(b-c)){
      result = true;
    }
  } else if (a<b && b>c && a>c){
    if(Math.abs(c-a)==Math.abs(a-b)){
      result = true;
    }
  } else if (a<b && b>c && a<c){
    if(Math.abs(a-c)==Math.abs(c-b)){
      result = true;
    }
  } else if (b<a && b<c && a<c){
    if(Math.abs(b-a)==Math.abs(a-c)){
      result = true;
    }
  } else if (b<a && b<c && a>c){
    if(Math.abs(b-c)==Math.abs(a-c)){
      result = true;
    }
  } else if (c<b && c<a && a<b){
    if(Math.abs(c-b)==Math.abs(b-a)){
      result = true;
    }
  } else if (c==b && b==a){
    result = true;
  }
  return result;
}
