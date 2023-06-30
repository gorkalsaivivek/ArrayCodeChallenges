package src;

public class StockPrices {
	
	public int getMaxProfit(int[] stockPrices) {
		//[7,1,5,3,6,4]
		int value=0;
		for(int i=0;i<stockPrices.length;i++) {
			for(int j=i+1;j<stockPrices.length;j++) {
				if(stockPrices[i]<stockPrices[j]) {
					value=Math.max(stockPrices[j]-stockPrices[i], value);
				}
			}
		}
		System.out.println("the max profit is :"+value);
		return value;
		
	}
	
	

}
