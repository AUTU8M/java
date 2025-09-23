public class Highest_altitude {


    // Sample main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};

        System.out.println("Max altitude (gain1): " + solution.largestAltitude(gain1)); // Output: 1
        System.out.println("Max altitude (gain2): " + solution.largestAltitude(gain2)); // Output: 0
    }

    static class Solution {
        public int largestAltitude(int[] gain) {
            int maxAltitude = 0;
            int currentAltitude = 0;

            for (int g : gain) {
                currentAltitude += g;
                maxAltitude = Math.max(maxAltitude, currentAltitude);
            }

            return maxAltitude;
        }
    }

}
