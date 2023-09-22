package codingPractise;

public class MethodsinJava {

	public static void main(String[] args) {
		// Methods in Java
		//Void method
		show();
		//Int method
		//Method with parameters
		double r=division(2,2);
		System.out.println(r);
		Display(2,1);
	}
	static void show() {
		System.out.println("Show");
	}
	 static void Display(int a,int b) {
		 
		 System.out.println(Addi(a,b));
		
	}
	 static int Addi(int a,int b) {
		 int c=a+b;
		 return c;
	 }
	 static double division(double a,double b) {
		 double c=a/b;
		 return c;
	 }
}
