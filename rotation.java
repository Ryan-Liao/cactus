
public class rotation {
	/*public void rotate(int[] nums, int k) {	
		int temp = 0;
		for(int i = 0; i < k; i++) {
			temp = nums[nums.length-1];
			for(int j = nums.length-1; j > 0; j--) {			
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
		for(int i = 0; i < nums.length; i++)
        System.out.print(nums[i]);
    }*/
	
	public void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	    for(int i = 0; i < nums.length; i++)
	        System.out.print(nums[i]);
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
}
