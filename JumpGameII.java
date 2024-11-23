public class JumpGameII {
	
	public static void main(String[] args){
		
		//int nums[] = {2,3,1,1,4};
		int nums[] = {3, 4, 5, 2, 3, 1, 4, 2};
		
		JumpGameII result = new JumpGameII();
		System.out.print(result.jump(nums));
		
	}
	
	public int jump(int[] nums) {
		int jumps = 0;
		int current = 0; 
		int farthest = 0; 
		
		for(int i=0; i<nums.length-1; i++)
		{
			farthest = Math.max(farthest, nums[i]+i);
			if(i==current)
			{
				jumps++;
				current = farthest;
			}
		}
		
		return jumps;
	}		
}