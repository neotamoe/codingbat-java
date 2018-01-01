// Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
// (spaces added to show the grouping). Note that the length of the array will be
// 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
//
// seriesUp(3) → [1, 1, 2, 1, 2, 3]
// seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
// seriesUp(2) → [1, 1, 2]

public int[] seriesUp(int n) {
  int[] series = new int[n*(n+1)/2];
  int start = 1;
  int round = 1;
  for(int i=0; i<n*(n+1)/2; i++){
    if(round==1){
      series[i]=start;
      round++;
    } else if(round>1 && start>round){
      round++;
      start = 1;
      series[i]=start;
      start++;
    } else if(round>1){
      series[i]=start;
      start++;
    }
  }
  return series;
}
