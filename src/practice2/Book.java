package practice2;
import java.util.Date;
public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public boolean equals(Object o) {
		if (this == o) {return true;}
		if (o instanceof Book) {
			Book b = (Book) o;
			if (this.title == b.title && this.publishDate == b.publishDate) {
				return true;
			}
		}
		return false;
	}
	public int hashCode() {
		int i = 37;
		i = i * title.hashCode() * 31;
		i = i * publishDate.hashCode() * 31;
		return i;
	}
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date) this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}
	public int compareTo(Book b) {
//		if (this.publishDate > b.publishDate) {
//			return -1;
//		}
//		if (this.publishDate > b.publishDate) {
//			return 1;
//		}
//		if (this.publishDate == b.publishDate) {
//			return 0;
//		}
		return this.publishDate.compareTo(b.publishDate);
	}
}
