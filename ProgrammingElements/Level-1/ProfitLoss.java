
public class ProfitLoss {

	public static void main(String[] args) {
		int costPrice=129;
		int sellingPrice=191;
		int profit=sellingPrice-costPrice;
		float profitPercentage=(profit/costPrice)*100f;
		System.out.println("The Cost Price is INR " + costPrice +
				" and Selling Price is INR " + sellingPrice + "\n"
						+ "profit is INR " + profit + " and "
								+ "Selling Price Percentage is "+ profitPercentage);
	}

}
