public class JumpGame {
	
	public static void main(String[] args) {
		
	}
	
	public boolean canJump(int[] nums){
		
		int n = nums.length;
		
		if(n==1)
			return true;
		int max = 0;
		
		for(int i=0; i<n-1 && max>=i; i++)
		{
			if(max<index + nums[i])
			{
				max = i + num[i];
			}
			
			if(max>=n-1)
			{
				return true;
			}
			
		}
		
		return false;
	}
}