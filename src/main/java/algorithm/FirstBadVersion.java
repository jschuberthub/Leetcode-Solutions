package algorithm;

public class FirstBadVersion {

  /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

  public int firstBadVersion(int n) {
    int low = 0;
    int high = n;
    int result = n;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (isBadVersion(mid)) {
        result = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;
  }
}
