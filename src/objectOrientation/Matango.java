package objectOrientation;

public class Matango {
//	int hp;
//	final int LEVEL = 10;
//	char suffix;
//	void run() {
//		System.out.println("おばけキノコ" + suffix + "は逃げ出した。");
//	}
//	chapter11////////////////
	int hp = 50;
	private char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}
}
