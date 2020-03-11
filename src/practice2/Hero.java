package practice2;
import java.io.Serializable;

public class Hero implements Serializable {
	private String name;
	private int hp;
	private int mp;
	Hero(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public String getName() {return this.name;}
}
