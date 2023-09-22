package codingPractise;

public class CFSConditionalStatements {

	public static void main(String[] args) {
		// Control Flow Statements 
		//Conditional statements
		//1.if condition statement
		int a = 10;
		if(a==10) {
				System.out.println("a value is 10");
		}
		//2.if-else condition statement
		int b =12;
		if(b==10) {
			System.out.println("Value of b is 10");
		}else {
			System.out.println("Value of b is not equal to 10");
		}
		//3.else if condition statements
		//at the top if condition statement is present and at the bottom else condition statement is present
		//and else if condition statement is sandwiched between these.
		int z=15;
		if(z==10) {
			System.out.print("Value of z is 10");
		}else if(z==11) {
			System.out.print("Valur of z is 11");
			
		}else {
			System.out.print("Value of z is another number");
		}
		//nested if condition statement
		int g=10;
		if(g>0) {
			if(g==10) {
				System.out.print("\nValue of g is 10");
				
			}
		}
		//example of Switch case
		int y=123;
		switch(y) {
		case 14:
			System.out.print("\nValue of y is 14");
			break;
		case 12:
			System.out.print("\nValue of y is 12");
			break;
		default:
			System.out.print("\nValue of y is another number");;
			break;
		}
	}

}
