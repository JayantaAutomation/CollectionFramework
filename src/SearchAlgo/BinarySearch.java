package SearchAlgo;

public class BinarySearch {

/*
 * Author: Jayanta Kumar Panda
 * 
 */
	
	public static void main(String[] args) {

		// Change the target number and check the output.
		//int nums[] = { 5, 7, 9, 11, 13 };
		//int target = 13;

		int nums[] = new int[1000];
		int target = 500;
		
		int result = BinarySearch(nums, target);

		if (result != -1)
			System.out.println("Element found at Index : " + result);
		else
			System.out.println("Element not found");
	}

	private static int BinarySearch(int[] nums, int target) {
		//5, 7, 9, 11, 13
		int steps = 0;
		int left = 0;
		int right = nums.length-1;
		
		while(left<= right) {
			steps++;
			int mid = (left + right)/2;
			
			if(nums[mid] == target)
			{
				System.out.println("Steps taken by Binary : " + steps);
				return mid;
			}
			else if(nums[mid] < target) {
			left = mid + 1;
			
			}
			
			else
				right = mid - 1;
		}
		System.out.println("Steps taken by Binary : " + steps);
		return -1;
	}

}
