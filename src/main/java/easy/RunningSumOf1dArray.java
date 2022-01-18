package easy;

import java.util.ArrayList;
import java.util.List;

public class RunningSumOf1dArray {

  public int[] runningSum(int[] nums) {
    List<Integer> list = new ArrayList<>();
    int buffer = 0;
    for (int num : nums) {
      list.add(num + buffer);
      buffer += num;
    }
    return list.stream().mapToInt(i -> i).toArray();
  }
}
