public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},   // Wealth = 6
                {3, 2, 1},   // Wealth = 6
                {4, 3, 2},   // Wealth = 9 ✅ (richest)
                {1, 1, 1}    // Wealth = 3
        };
        int maxval = 0;

        // loop through rows (each person's accounts)
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            // loop through columns (each bank for that person)
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j]; // correct access
            }

            if (sum > maxval) {
                maxval = sum;
            }

        }
        System.out.println(maxval);
    }
}
