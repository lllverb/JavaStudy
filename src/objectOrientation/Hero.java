package objectOrientation;

public class Hero {
	String name;
	int hp;
	Sword sword;
	void attack() {
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた。");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って体力を回復した。");
	}
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は座って体力を" + sec + "回復した。");
	}
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んで5ダメージを受けた");
	}
	void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GameOver");
		System.out.println("最終hpは" + this.hp + "でした");
	}

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
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
}
