package easy;

public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        String[] split = s.split("");

        int balance = 0;
        int solution = 0;

        for (String value : split) {
            if (value.equals("L")) {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                solution++;
            }
        }
        return solution;
    }

}
