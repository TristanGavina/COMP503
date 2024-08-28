public class DifferentMain {

	static int sum(int[] array) {
		int totalSum = 0;  // Initialize sum to 0

		// Iterate through each element in the array
		for (int num : array) {
			// Add to totalSum only if the number is positive
			if (num > 0) {
				totalSum += num;
			}
		}

    // Return the sum of positive numbers
		return totalSum;
	}

// Test cases
	public static void main(String[] args) {
		System.out.println(sum(new int[]{10, 4, 5, 6, 7}));  // Output: 32
		System.out.println(sum(new int[]{}));  // Output: 0
		System.out.println(sum(new int[]{-10, -4, -5, -6, -7}));  // Output: 0
	}
}