// We want to make a row of bricks that is goal inches long. We have a number of
// small bricks (1 inch each) and big bricks (5 inches each). Return true if it is
// possible to make the goal by choosing from the given bricks. This is a little
// harder than it looks and can be done without any loops.

public boolean makeBricks(int small, int big, int goal) {
  Boolean canDo = false;
  // if goal is a multiple of 5, check if there are enough 5 length bricks
  if(goal%5==0 && goal/5>=big){
    canDo = true;
  // if you take away # of 1 bricks, are you left with multiple of 5?  if so,
  // do you have at least enough 5 bricks?
  } else if (((goal-small)%5==0) && (goal-small<=5*(big))){
    canDo = true;
// take away # of big bricks, do you have enough small bricks to meet goal
  } else if ( (big*5 < goal) && (goal-(big*5)<=small)){
    canDo = true;
  }
  return canDo;
}

// My Solution passes all of the listed tests, but does not pass for other tests (tests that
// aren't shown).
