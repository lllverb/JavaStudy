package objectOrientation;

public class Hero {
//	Chapter8////////////////////////////////////////////
	String name;
	int hp;
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
//	Chapter8////////////////////////////////////////////
}
