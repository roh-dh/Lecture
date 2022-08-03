package hijava.oop;

public class SubTotal {
	public int sum(int[] nums) {
		int result = 0;
		for(int num : nums){
			result += num;
		}
		return result;
	}
	
	public int avg(int[] nums) {
		int total = sum(nums);
		return total / nums.length;
	}
}
