package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefangingAnIPAddress {

  public String defangIPaddr(String address) {
    List<Character> characterList = new ArrayList<>();
    char[] chars = address.toCharArray();

    for (char aChar : chars) {
      if (aChar == '.') {
        characterList.add('[');
        characterList.add(aChar);
        characterList.add(']');
      } else {
        characterList.add(aChar);
      }
    }
    return characterList.stream().map(Object::toString).collect(Collectors.joining());
  }
}
