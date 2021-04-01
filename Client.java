package javaIntroduction;

public class Client {
	
	private String companyName;
	private double netProfit;
	
	public Client() {
		companyName = "";
		netProfit = 0;
	}
	
	public Client(String companyName, double netProfit) {
		setNetProfit(netProfit);
		setCompanyName(companyName);
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double netProfit) {
		this.netProfit = netProfit;
	}
	
}
