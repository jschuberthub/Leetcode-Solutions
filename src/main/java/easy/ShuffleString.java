package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        int counter = 0;
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (indices[i] == counter) {
                list.add(chars[i]);
                counter++;
                i = -1;
            }
        }
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

    }
}
