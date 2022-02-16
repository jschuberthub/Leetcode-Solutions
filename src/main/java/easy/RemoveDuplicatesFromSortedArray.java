package easy;

public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    int i = 0;
    int k = 0;
    for (int j = 0; j < nums.length; j++) {
      int currentElem = nums[k];

      if (currentElem != nums[j]) {
        nums[i] = currentElem;
        k = j;
        i++;
        nums[i] = nums[j];
      }
    }

    return i + 1;
  }
}
