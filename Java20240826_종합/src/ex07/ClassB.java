package ex07;

public class ClassB extends ClassA{

	private int b;
	
	public ClassB(int b) {
		this.b = b;
	}

	public ClassB(int a,int b) {
	    super(a);
		this.b = b;
	}
	
	@Override
	void info() {
		super.info();
		System.out.print(b + " ");
	}
}
