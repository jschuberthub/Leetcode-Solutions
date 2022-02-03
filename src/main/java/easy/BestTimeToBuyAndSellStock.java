package easy;

public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int ans = 0;
    if (prices.length == 0) {
      return ans;
    }
    int bought = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > bought) {
        if (ans < (prices[i] - bought)) {
          ans = prices[i] - bought;
        }
      } else {
        bought = prices[i];
      }
    }
    return ans;
  }
}
