package ex03;

public class Child extends Parent {
	 public String name;
	    
	    public Child() {
	    	 //super(); super()나 this()는 첫줄에 위치해야함
	    	this("홍길동");
	        System.out.println("Child() call");
	        System.out.println(nation);
	    }
	    
	    public Child(String name) {
	    	super(); // 메모리에 이미 올라가 있음, 힙영역
	        this.name = name;
	        System.out.println("Child(String name) call");
	        System.out.println(nation);
	    }
}
