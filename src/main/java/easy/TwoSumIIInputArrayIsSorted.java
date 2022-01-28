package easy;

public class TwoSumIIInputArrayIsSorted {

  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    int start = 0, end = numbers.length - 1;
    while (start < end) {
      if (numbers[start] + numbers[end] == target) {
        result[0] = start + 1;
        result[1] = end + 1;
        break;
      } else if (numbers[start] + numbers[end] > target) end--;
      else start++;
    }
    return result;
  }
}
