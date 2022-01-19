package easy;

public class CapitalizeTheTitle {

  public String capitalizeTitle(String title) {
    title = title.toLowerCase();
    String[] st = title.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String s : st) {
      if (s.length() >= 3) {
        sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
      } else {
        sb.append(s).append(" ");
      }
    }
    return sb.toString().trim();
  }
}
