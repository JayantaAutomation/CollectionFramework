package SearchAlgo;

public class LinearSearch {

/*
 * Author: Jayanta Kumar Panda
 * 
 */
	
	public static void main(String[] args) {

		//Change the target number and check the output.
		//int nums[] = { 5, 7, 9, 11, 13 };
		//int target = 13;

		int nums[] = new int[1000];
		int target = 500;
		
		int result = LinearSearch(nums, target);

		if (result != -1)
			System.out.println("Element found at Index : " + result);
		else
			System.out.println("Element not found");
	}

	private static int LinearSearch(int[] nums, int target) {
		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			steps++;
			if (nums[i] == target) {
				System.out.println("Steps taken by Linear : " + steps);
				return i;
			}
		}
		System.out.println("Steps taken by Linear : " + steps);
		return -1;
	}

}
