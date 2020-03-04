package objectOrientation;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
	public String getName() {return this.name;}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnull");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短い");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長い");
		}
		this.name = name;
	}
	public int getHp() {return this.hp;}
	public void setHp(int hp) {
		if (hp <0) {
			this.hp = 0;
		}
	}
	public int getMp() {return this.mp;}
	public void setMp(int mp) {
		if (mp <0) {
			throw new IllegalArgumentException("mpが負の数");
		}
	}
	public void setWand(Wand w) {
		if (w == null) {
			throw new IllegalArgumentException("杖がnull");
		}
	}
	public Wand getWand() {return this.wand;}
}
