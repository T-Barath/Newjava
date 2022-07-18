package Pojo;

public class ClassA {
		
	public static void main(String[] args) {
		ClassB a = new ClassB();
		System.out.println(a.getI());
		
		a.setI(26);
		System.out.println(a.getI());
	}
}
