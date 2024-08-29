package ex14;

public class Container <T> {
	
	private T value;
	public T getItem() {return value;}
	public void setItem(T value) {this.value = value;}
	
	boolean isEmpty() {return value==null;}
}


