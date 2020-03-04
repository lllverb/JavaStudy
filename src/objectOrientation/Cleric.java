package objectOrientation;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	Cleric(String name, int hp){
		this(name, hp, Cleric.MAX_MP);
	}
	Cleric(String name){
		this(name, Cleric.MAX_HP, Cleric.MAX_MP);
	}
	void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");
		int rand = new java.util.Random().nextInt(3);
		int recovery = sec + rand;
		if (this.MAX_MP - this.mp > recovery) {
			this.mp += recovery;
		} else {
			this.mp = MAX_MP;
		}
		System.out.println("MPが" + this.mp + "になった");//あってる
		return recovery;
	}
}
