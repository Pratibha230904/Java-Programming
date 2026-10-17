
import java.util.Arrays;

class Solution {

    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Step 1: Store original indices
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: Sort indices by digit sum,
        // then by number if digit sums are equal
        Arrays.sort(indices, (i, j) -> {
            int sumA = digitSum(nums[i]);
            int sumB = digitSum(nums[j]);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return Integer.compare(nums[i], nums[j]);
        });

        // Step 3: Count minimum swaps using cycles
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {

            // Already visited or already in correct position
            if (visited[i] || indices[i] == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;

                j = indices[j];

                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }

    // Calculate the sum of digits
    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
