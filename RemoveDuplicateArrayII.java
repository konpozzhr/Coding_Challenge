
public class RemoveDuplicateArrayII {
	
	public static void main(String[] args){
		
		int nums[] = {0,0,1,1,1,1,2,3,3};
		
		int newNum = removeDuplicate(nums);
		
		// output result
		System.out.println(newNum);
		
		// output each element of new array
		System.out.println("New array");
		for (int i=0; i<newNum; i++){
			System.out.print(nums[i] + ", ");
		}
		
	}
	
	public static int removeDuplicate(int[] nums){
		int i=0;
		
		for(int n:nums)
		{
			if(i<2 || n != nums[i-2])
			{
				nums[i++] = n;
			}
		}
		return i;
	}
}
