// When squirrels get together for a party, they like to have cigars. A squirrel
// party is successful when the number of cigars is between 40 and 60, inclusive.
// Unless it is the weekend, in which case there is no upper bound on the number of
// cigars. Return true if the party with the given values is successful, or false
// otherwise.
public boolean cigarParty(int cigars, boolean isWeekend) {
  Boolean result = false;
  if(cigars>=40 && cigars<=60 && !isWeekend){
    result = true;
  } else if(cigars>=40 && isWeekend){
    result = true;
  }
  return result;
}

// You and your date are trying to get a table at a restaurant. The parameter "you" is
// the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of
// your date's clothes. The result getting the table is encoded as an int value with
// 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result
// is 2 (yes). With the exception that if either of you has style of 2 or less, then
// the result is 0 (no). Otherwise the result is 1 (maybe).
public int dateFashion(int you, int date) {
  int result = 1;

  if((you>=8 && date>2) || (date>=8 && you>2)){
   result = 2;
  } else if ((you>=8 && date<=2) || (date>=8 && you<=2) || you<=2 || date <=2){
   result = 0;
  } else {
    result = 1;
  }
  return result;
}

// The squirrels in Palo Alto spend most of the day playing. In particular, they play
// if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the
// upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer,
// return true if the squirrels play and false otherwise.
public boolean squirrelPlay(int temp, boolean isSummer) {
  Boolean result = false;
  if(temp>=60 && temp<=90 && !isSummer){
    result = true;
  }
  if(temp>=60 && temp<=100 && isSummer){
    result = true;
  }
  return result;
}

// You are driving a little too fast, and a police officer stops you. Write code to
// compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big
// ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80
// inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is
// your birthday -- on that day, your speed can be 5 higher in all cases.
public int caughtSpeeding(int speed, boolean isBirthday) {
  int result = 0;

  if(!isBirthday){
    if(speed>=61 && speed<=80){
      result = 1;
    } else if (speed >80){
      result = 2;
    }
  } else if (isBirthday){
    if(speed>=66 && speed<=85){
      result = 1;
    } else if (speed >85){
      result = 2;
    }
  }
  return result;
}

// Given 2 ints, a and b, return their sum. However, sums in the range 10..19
// inclusive, are forbidden, so in that case just return 20.
public int sortaSum(int a, int b) {
  int sum = a + b;
  if(sum>=10 && sum<=19){
    sum = 20;
  } else {
    sum = sum;
  }
  return sum;
}

// Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean
// indicating if we are on vacation, return a string of the form "7:00" indicating
// when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the
// weekend it should be "10:00". Unless we are on vacation -- then on weekdays it
// should be "10:00" and weekends it should be "off".
public String alarmClock(int day, boolean vacation) {
  String alarm = "";
  if(vacation && day>0 && day<6){
    alarm = "10:00";
  } else if (vacation && (day==0 || day==6)){
    alarm = "off";
  } else if(!vacation && day>0 && day<6){
    alarm = "7:00";
  } else {
    alarm = "10:00";
  }
  return alarm;
}

// The number 6 is a truly great number. Given two int values, a and b, return true
// if either one is 6. Or if their sum or difference is 6. Note: the function
// Math.abs(num) computes the absolute value of a number.
public boolean love6(int a, int b) {
  return (a+b==6 || Math.abs(a-b)==6 || Math.abs(b-a)==6 || a==6 || b==6);
}

// Given a number n, return true if n is in the range 1..10, inclusive. Unless
// outsideMode is true, in which case return true if the number is less or equal to
// 1, or greater or equal to 10.
public boolean in1To10(int n, boolean outsideMode) {
  Boolean result = false;
  if(outsideMode){
    if(n>=10 || n<=1){
      result = true;
    } else {
      result = false;
    }
  } else if (!outsideMode){
    if(n>=1 && n<=10){
      result = true;
    } else {
      result = false;
    }
  }
  return result;
}

// We'll say a number is special if it is a multiple of 11 or if it is one more
// than a multiple of 11. Return true if the given non-negative number is special.
// Use the % "mod" operator
public boolean specialEleven(int n) {
  return (n%11==0 || n%11==1);
}

// Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
public boolean more20(int n) {
  return (n%20==1 || n%20==2);
}

// Return true if the given non-negative number is a multiple of 3 or 5, but not both.
public boolean old35(int n) {
  return ((n%5==0 || n%3==0) && n%15!=0);
}

// Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
//So for example 38 and 39 return true, but 40 returns false.
public boolean less20(int n) {
  return (n%20==18 || n%20==19);
}

// Given a non-negative number "num", return true if num is within 2 of a multiple of
// 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
public boolean nearTen(int num) {
  return (num%10==2 || num%10==1 || num%10==8 || num%10==9 || num%10==0);
}

// Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
// inclusive, are extra lucky. So if either value is a teen, just return 19.
public int teenSum(int a, int b) {
  int result = 0;
  if ((a>=13 && a<=19) || (b>=13 && b<=19) ){
    result = 19;
  } else {
    result = a + b;
  }
  return result;
}

// Your cell phone rings. Return true if you should answer it. Normally you answer,
// except in the morning you only answer if it is your mom calling. In all cases,
// if you are asleep, you do not answer.
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  Boolean answer = false;

  if(isAsleep){
    answer = false;
  } else if (!isMorning){
    answer = true;
  } else if (isMorning && isMom){
    answer = true;
  } else {
    answer = false;
  }
  return answer;
}


// We are having a party with amounts of tea and candy. Return the int outcome of the party
// encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at
// least 5. However, if either tea or candy is at least double the amount of the other
// one, the party is great (2). However, in all cases, if either tea or candy is less
// than 5, the party is always bad (0).
public int teaParty(int tea, int candy) {
  int result = 0;

  if(tea<5 || candy<5){
    result = 0;
  } else if ((tea>=2*candy) || (candy>=2*tea)){
    result = 2;
  } else if (tea>=5 && candy>=5){
    result = 1;
  }
  return result;
}

// Given a string str, if the string starts with "f" return "Fizz". If the string
// ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return
// "FizzBuzz". In all other cases, return the string unchanged.
public String fizzString(String str) {
  String result;
  if (str.charAt(0)=='f' && str.charAt(str.length()-1)=='b'){
    result = "FizzBuzz";
  } else if(str.charAt(0)=='f'){
    result = "Fizz";
  } else if (str.charAt(str.length()-1)=='b'){
    result = "Buzz";
  } else {
    result = str;
  }
  return result;
}

// Given an int n, return the string form of the number followed by "!". So the int 6
// yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number,
// and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5,
// use "FizzBuzz".
public String fizzString2(int n) {
  String result;
  if(n%15==0){
    result = "FizzBuzz!";
  } else if (n%3==0){
    result = "Fizz!";
  } else if (n%5==0){
    result = "Buzz!";
  } else {
    result = n+"!";
  }
  return result;
}

// Given three ints, a b c, return true if it is possible to add two of the ints
// to get the third.
public boolean twoAsOne(int a, int b, int c) {
  Boolean result;
  if(a+b==c){
    result = true;
  } else if (b+c==a){
    result = true;
  } else if (a+c==b){
    result = true;
  } else {
    result = false;
  }
  return result;
}

// Given three ints, a b c, return true if b is greater than a, and c is greater than
// b. However, with the exception that if "bOk" is true, b does not need to be greater
// than a.
public boolean inOrder(int a, int b, int c, boolean bOk) {
  Boolean result = false;
  if(!bOk && b>a && c>b){
    result = true;
  }
  if(bOk && c>b){
    result = true;
  }
  return result;
}

// Given three ints, a b c, return true if they are in strict increasing order, such
// as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if
// "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return ((a<b && b<c) || (equalOk && a<=b && b<=c));
}

// Given three ints, a b c, return true if two or more of them have the same rightmost
// digit. The ints are non-negative. Note: the % "mod" operator computes the remainder,
// e.g. 17 % 10 is 7.
public boolean lastDigit(int a, int b, int c) {
  Boolean result = false;
  for (int i=0; i<10; i++){
    if (a%10==i && (b%10==i || c%10==i)){
      return result = true;
    } else if ((a%10==i || b%10==i) && c%10==i){
      return result = true;
    } else if ((a%10==i || c%10==i) && b%10==i){
      return result = true;
    }
  }
  return result;
}

// Given three ints, a b c, return true if one of them is 10 or more less than one
// of the others.
public boolean lessBy10(int a, int b, int c) {
  return (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10);
}

// Given two int values, return whichever value is larger. However if the two values
// have the same remainder when divided by 5, then the return the smaller value. However,
// in all cases, if the two values are the same, return 0.
public int maxMod5(int a, int b) {
  int theNumber = 0;
  if(a==b){
    theNumber = 0;
  } else if (a%5==b%5){
    if(a<b){
      theNumber = a;
    } else {
      theNumber = b;
    }
  } else {
    if(a>b){
      theNumber = a;
    } else {
      theNumber = b;
    }
  }
  return theNumber;
}

// You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or
// 2. If they are all the value 2, the result is 10. Otherwise if they are all the
// same, the result is 5. Otherwise so long as both b and c are different from a,
// the result is 1. Otherwise the result is 0.
public int redTicket(int a, int b, int c) {
  int redTicketValue = 0;
  if(a==2 && a==b && a==c){
    redTicketValue = 10;
  } else if (a==b && b==c){
    redTicketValue = 5;
  } else if (a!=b && a!=c){
    redTicketValue = 1;
  }
  return redTicketValue;
}

// You have a green lottery ticket, with ints a, b, and c on it. If the numbers are
// all different from each other, the result is 0. If all of the numbers are the same,
// the result is 20. If two of the numbers are the same, the result is 10.
public int greenTicket(int a, int b, int c) {
  int greenTicketValue = 0;
  if(a==b && b==c){
    greenTicketValue = 20;
  } else if (a==c || b==c || a==b){
    greenTicketValue = 10;
  } else if (a!=b && b!=c){
    greenTicketValue = 0;
  }
  return greenTicketValue;
}

// You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
// which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If
// any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly
// 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
public int blueTicket(int a, int b, int c) {
  int blueTicketValue = 0;

  if(a+b==10 || a+c==10 || b+c==10){
    blueTicketValue = 10;
  } else if (Math.abs((a+b)-(b+c))>=10 || Math.abs((a+b)-(a+c))>=10){
    blueTicketValue = 5;
  }
  return blueTicketValue;
}

// Given two ints, each in the range 10..99, return true if there is a digit that
// appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10,
// gives the left digit while the % "mod" n%10 gives the right digit.)
public boolean shareDigit(int a, int b) {
  return (a/10==b%10 || b/10==a%10 || a%10==b%10 || a/10==b/10);
}

// Given 2 non-negative ints, a and b, return their sum, so long as the sum has the
// same number of digits as a. If the sum has more digits than a, just return a without
// b. (Note: one way to compute the number of digits of a non-negative int n is to
// convert it to a string with String.valueOf(n) and then check the length of the
// string.)
public int sumLimit(int a, int b) {
  int sum = 0;
  int alength = String.valueOf(a).length();
  int sumLength = String.valueOf(a+b).length();

  if(alength == sumLength){
    sum = a+b;
  } else if (sumLength > alength){
    sum = a;
  }
  return sum;
}

// Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if
// noDoubles is true, if the two dice show the same value, increment one die to the
// next value, wrapping around to 1 if its value was 6.
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = 0;
  if(!noDoubles){
    return sum = die1+die2;
  } else if (noDoubles && die1==die2){
    if(die1==6){
      return sum = 7;
    } else {
      return sum = die1 + die2 + 1;
    }
  } else if (noDoubles){
    return sum = die1 + die2;
  }
  return sum;
}