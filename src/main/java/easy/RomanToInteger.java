package easy;

public class RomanToInteger {

  public int romanToInt(String s) {
    int num = 0;
    int len = s.length();
    int last = 1000;
    for (int i = 0; i < len; i++) {
      int v = getValue(s.charAt(i));
      if (v > last) num = num - last * 2;
      num = num + v;
      last = v;
    }
    return num;
  }

  private int getValue(char c) {
      return switch (c) {
          case 'I' -> 1;
          case 'V' -> 5;
          case 'X' -> 10;
          case 'L' -> 50;
          case 'C' -> 100;
          case 'D' -> 500;
          case 'M' -> 1000;
          default -> 0;
      };
  }

}
