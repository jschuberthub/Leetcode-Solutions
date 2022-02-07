package easy;

public class BuildArrayFromPermutation {

  public int[] buildArray(int[] nums) {
    if (nums.length == 0) return null;
    int len = nums.length;
    int[] ans = new int[len];
    for (int i = 0; i < len; i++) {
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}
