package objectOrientation;

public class Wand {
	private String name;
	private double power;
	public String getName() {return this.name;}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnull");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短い");
		}
		this.name = name;
	}
	public double getPower() {return this.power;}
	public void setPower(double power) {
		if (power <= 0.5) {
			throw new IllegalArgumentException("パワーが0.5以下");
		}
		if (power >= 100.0) {
			throw new IllegalArgumentException("パワーが100.0以上");
		}
	}
}
