package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationOfArray {

  // https://leetcode.com/problems/concatenation-of-array/
  public int[] getConcatenation(int[] nums) {
    return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
  }
}
