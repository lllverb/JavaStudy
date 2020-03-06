package practice2;

public class Pocket<E> {
	private E data;
	public void put(E e) {this.data = e;}
	public E get() {return this.data;}
}
