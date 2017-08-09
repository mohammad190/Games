package animation;


public class Main {

	public static void main(String[] args) {
		Fight fight = new Fight();
		fight.setPlayerName("BarakObama");
		fight.setHairStyle("Ugly");
		fight.setCountry("USA");
		fight.setAmount(25300);
		fight.setPrice(58.56);
		System.out.println("My player name " + fight.getPlayerName() + 
				" His hair style is " + fight.getHairStyle() + 
				" He lives in " + fight.getCountry() + " He earn " + fight.getAmount() + 
				" He is price is " + fight.getPrice());
		
		Fight fight1 = new Fight("don" , "dffrh", "green");
		System.out.println(fight1.getPlayerName()+"  " 
		+ fight1.getCountry()+ " " + fight1.getHairStyle() + " ");
		
		
	}

}
