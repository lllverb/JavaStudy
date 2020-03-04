package objectOrientation;

public class Computer extends TangibleAsset{
//	private String name;
//	private int price;
//	private String color;
//	private String makerName;
//	public Computer(String name, int price, String color, String makerName) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.makerName = makerName;
//	}
//	public String getName() {return this.name;}
//	public int getPrice() {return this.price;}
//	public String getColor() {return this.color;}
//	public String getmakerName() {return this.makerName;}
	private String makerName;
	public Computer(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.makerName = isbn;
	}
	public String getmakerName() {return this.makerName;}
}
