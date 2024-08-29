package ex13;

public class ContainerExample2{

	public static void main(String[] args) {
		Container1<String,String> container1 = new Container1<String,String>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		System.out.println(container1);
		
		System.out.println(name1+" 직접입력 "+job);
		
		Container1<String,Integer> container2 = new Container1<String,Integer>();
		container2.set("홍길동",35);
		String name2 = container2.getKey();
		int age = container2.getValue();

		System.out.println(container2);
		
		System.out.println(name2+" 직접입력 "+age);
	}
}
    class Container1<K,V>{
	
	private K name;
	private V job;
	
	public K getKey() {
        return name;
    }
 
    public V getValue() {
        return job;
    }
    public void set(K key , V value) {
        this.name = key;
        this.job = value;
    }
    
    @Override
    	public String toString() {
    		return "Container1(이름:"+ name + ", 직업(혹은나이):" + job+")";
    	}
	
}
