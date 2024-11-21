



public class BestTimeToBuyandSell{
	
	public static void main(String[] args){
		//int prices[] = {7,1,5,3,6,4};
		int prices[] = {7,6,4,3,1};
		
		BestTimeToBuyandSell result = new BestTimeToBuyandSell();
		System.out.print(result.maxProfit(prices));
		
	}
	
	
	public int maxProfit(int[] prices){
		if(prices == null || prices.length <= 0)
			return 0;
		
		int minPrice = prices[0];
		int profit = 0;
		for(int i=0; i<prices.length; i++)
		{
			minPrice = Math.min(minPrice, prices[i]);
			profit = Math.max(profit, prices[i] - minPrice);
		}
		return profit;
	}
}