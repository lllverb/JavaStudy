package objectOrientation;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 9;
	final int MAX_MP = 10;
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
		System.out.println("MPが" + this.mp + "になった");
		return recovery;
	}
}
