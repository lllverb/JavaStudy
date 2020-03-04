package objectOrientation;

public class TangibleAsset extends Asset implements Thing{
//	private String name;
//	private int price;
//	private String color;
//	public TangibleAsset(String name, int price, String color) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//	}
//	public String getName() {return this.name;}
//	public int getPrice() {return this.price;}
//	public String getColor() {return this.color;}
	////////////////////////////////////////////////////////
//	private String color;
//	public TangibleAsset(String name, int price, String color) {
//		super(name, price);
//		this.color = color;
//	}
//	public String getColor() {return this.color;}
	////////////////////////////////////////////////////////
	private String color;
	private double weight;
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {return this.color;}
	public double getWeight() {return this.weight;}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
