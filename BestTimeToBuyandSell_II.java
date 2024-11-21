
public class BestTimeToBuyandSell_II{
	
	public static void main(String[] args){
		
		int prices[] = {7,1,5,3,6,4};
		
		BestTimeToBuyandSell_II result = new BestTimeToBuyandSell_II();
		
		
		System.out.print(result.maxProfit(prices));
		
	}
	
	public int maxProfit(int[] prices)
	{
		if(prices.length == 0)
			return 0;
		
		int profit = 0;
			
		for(int i=0; i<prices.length-1; i++)
		{
			if(prices[i] < prices[i+1])
				profit += prices[i+1] - prices[i];
			
			//System.out.println("Profit of " + prices[i] + " & " + prices[i+1] + " = " + profit);
			
		}
		
		return profit;
	}
	
}