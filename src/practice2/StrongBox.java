package practice2;

public class StrongBox<E> {
	private E data;
	private KeyType keyType;
	private int count;
	public void put(E data) {this.data = data;}
	StrongBox(KeyType keyType){
		this.keyType = keyType;
	}
	public E get() {
		this.count ++;
		switch (this.keyType) {
		case PADLOCK:
			if (count < 1024) {return null;}
			break;
		case BUTTON:
			if (count < 10000) {return null;}
			break;
		case DIAL:
			if (count < 30000) {return null;}
			break;
		case FINGER:
			if (count< 1000000) {return null;}
			break;
		}
		this.count = 0;
		return this.data;
	}
}
