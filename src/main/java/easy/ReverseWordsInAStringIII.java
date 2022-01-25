package easy;

public class ReverseWordsInAStringIII {

  public String reverseWords(String s) {
    int n = s.length(), i = 0;
    String ans = "";
    while (i < n) {
      while (i < n && s.charAt(i) == ' ') i++;
      int j = i;
      while (i < n && s.charAt(i) != ' ') i++;
      if (ans.isEmpty()) {
        for (int x = i - 1; x >= j; x--) ans += s.charAt(x);
      } else {
        ans += " ";
        for (int x = i - 1; x >= j; x--) ans += s.charAt(x);
      }
    }
    return ans;
  }
}
