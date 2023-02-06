package dummyClasses;

public class H1 {

	 int a1=100;
	
	public static void main(String[] args) {
		
		H1 h=new H1();//calling inside instance method
		System.out.println(h.a1);
		//System.out.println(this.a1);--->CTE
		
		h.test1();
	}
	
	public void test() {
		System.out.println(this.a1);
		
		H1 a=new H1();
		System.out.println(a.a1);
	}
	
	public void test1() {
		this.test();
		
	}
}
