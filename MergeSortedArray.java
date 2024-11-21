
class Solution2 {
	
	public static void main(String[] args){
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,3,5};
		int m = 3;
		int n = 3;	
		
		Solution2 solution = new Solution2();			// We need to create instance of class to call non-static method
		solution.merge(nums1, nums2, m, n);				// one more way you can make method to static and can call directly in main 
		for(int i=0;i<m+n; i++)
		{
			System.out.print(nums1[i] + " ");
		}
	}
	
	public void merge(int[] nums1, int[] nums2, int m, int n){
		int i = m-1;
		int j = n-1; 
		int k = m+n-1;
		
		
		while(j>=0)
		{
			if(i>=0 && nums1[i]>nums2[j])
			{
				nums1[k] = nums1[i];
				k--;
				i--;		
			}
			else
			{
				nums1[k] = nums2[j];
				k--;
				j--;
			}
				
		}
	}
	

}
