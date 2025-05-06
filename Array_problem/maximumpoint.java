public class maximumpoint {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
   int sum = 0;
       for (int i = 0; i < k; i++) {
           sum += cardPoints[i];
       }
    int maxPoint = sum ;
       for (int i = 1; i <= k; i++) {
           sum = sum - cardPoints[k - i] + cardPoints[n - i];
           maxPoint = Math.max(maxPoint, sum);
       }
       return maxPoint;
   }
}
