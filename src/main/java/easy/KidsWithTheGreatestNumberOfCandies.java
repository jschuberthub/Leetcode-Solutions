package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int highestCandies = Arrays.stream(candies).max().getAsInt();
    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      if (candy + extraCandies >= highestCandies) {
        result.add(true);
      } else {
        result.add(false);
      }
    }
    return result;
  }
}
