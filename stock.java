package Day11;

public class stock 
{
	private String stockName;
	private int stockPrice;
	private int stockNumber;
	//Utility utility;

	public stock(String stockName,int stockPrice,int stockNumber)
	{
		this.stockName=stockName;
		this.stockPrice=stockPrice;
		this.stockNumber=stockNumber;
	}
	
	public stock(){
	}

	public String getStockName(){
		return stockName;
	}

	public int getStockPrice(){
		return stockPrice;
	}

	public int getStockNumber(){
		return stockNumber;
	}

	public void setStockName(String stockName){
		this.stockName=stockName;
	}

	public void setStockPrice(int stockPrice){
		this.stockPrice=stockPrice;
	}

	public void setStockNumber(int stockNumber){
		this.stockNumber=stockNumber;
	}

	public String toString(){
		return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";
	}
}
