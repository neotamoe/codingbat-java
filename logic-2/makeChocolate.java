// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
// and big bars (5 kilos each). Return the number of small bars to use, assuming we
// always use big bars before small bars. Return -1 if it can't be done.

public int makeChocolate(int small, int big, int goal) {
  int smallNeeded = 0;
  int amountAfterTakingAwayAllBig = goal-(big*5);

  if(amountAfterTakingAwayAllBig==0){
    smallNeeded = 0;
  } else if (amountAfterTakingAwayAllBig>0){
    if(amountAfterTakingAwayAllBig<=small){
      smallNeeded = amountAfterTakingAwayAllBig;
    } else {
      smallNeeded = -1;
    }
  } else if (big*5>goal){
    if (goal/5 <= big){
      smallNeeded = goal%5;
      if(smallNeeded<=small){
        smallNeeded = smallNeeded;
      } else {
        smallNeeded = -1;
      }
    }
  }

  return smallNeeded;
}
