package easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int[] account : accounts) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += account[j];
            }
            if (sum > max) max = sum;
            sum = 0;
        }
        return max;
    }
}
