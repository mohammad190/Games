package animation;

public class Fight {
	
	String playerName, country, HairStyle;
	int amount;
	double price;
	
	public Fight() {
		
	}
	public Fight(String playerName, String Country, String HairStyle) {
		this.playerName = playerName;
		this.country = country;
		this.HairStyle = HairStyle;
		
	}
	public Fight(String playerName, String country, String hairStyle, int amount, double price) {
		super();
		this.playerName = playerName;
		this.country = country;
		HairStyle = hairStyle;
		this.amount = amount;
		this.price = price;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getCountry() {
		return country;
	}
	public String getHairStyle() {
		return HairStyle;
	}
	public int getAmount() {
		return amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setHairStyle(String hairStyle) {
		HairStyle = hairStyle;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
