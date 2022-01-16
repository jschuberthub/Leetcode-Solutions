package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    Set<Integer> set = new HashSet<Integer>(list);
    return set.size() < list.size();
  }
}
