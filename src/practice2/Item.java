package practice2;

public class Item {
	private String name;
	private int price;
	private int weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		int intPrice = Integer.parseInt(price);
		this.price = intPrice;
	}
	public void setWeight(String weight) {
		int intWeight = Integer.parseInt(weight);
		this.weight = intWeight;
	}
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public int getWeight() {return this.weight;}
}
