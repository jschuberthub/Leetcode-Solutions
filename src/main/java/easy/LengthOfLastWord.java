package easy;

public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    String[] result = s.split("\\s+");
    return result[result.length - 1].length();
  }
}
