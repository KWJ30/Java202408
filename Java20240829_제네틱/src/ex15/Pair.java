package ex15;

public class Pair <K,V>{
	
	private K First;
	private V Second;
	
	public K getFirst() {
		return First;
	}
	public void setFirst(K first) {
		First = first;
	}
	public V getSecond() {
		return Second;
	}
	public void setSecond(V second) {
		Second = second;
	}
	
	@Override
	public String toString() {
		return "Pair(first=" + First + ", second=" + Second + ")";
	}

}
