package easy;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {

  public int[] sortArrayByParity(int[] nums) {
    //    Performance and Memory usage sucks, needs improvement
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();
    for (int num : nums) {
      if (num % 2 == 0) {
        even.add(num);
      } else {
        odd.add(num);
      }
    }

    even.addAll(odd);
    return even.stream().mapToInt(i -> i).toArray();
  }
}
