// Given 2 int values greater than 0, return whichever value is nearest to 21
// without going over. Return 0 if they both go over.

public int blackjack(int a, int b) {
  int finalValue = 0;
  int aDistance = 21-a;
  int bDistance = 21-b;
  if(aDistance<0 && bDistance>=0){
    finalValue = b;
  } else if (bDistance<0 && aDistance>=0){
    finalValue = a;
  } else if (aDistance>=0 && bDistance>=0){
    if(aDistance>bDistance){
      finalValue = b;
    } else if (bDistance>aDistance){
      finalValue = a;
    } else if (bDistance==aDistance){
      finalValue = a;
    }
  } else if (aDistance<0 && bDistance<0){
    finalValue = 0;
  }
  return finalValue;
}
