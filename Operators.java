package codingPractise;

public class Operators {

	public static void main(String[] args) {
		// This is an Example Of Operators in Java.
		//Types 
		// 1. Arithmetic Operators
		int a=10;int b=10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a*b);
		
		//2.Relational Operators
		int q=1;int w=1;if(q==w) {
			System.out.println("equal ");	
		}
		int e=1;int r=2;if(e!=r) {
			System.out.println("not equal ");	
		}
		int y=3;int u=2;if(y>u) {
			System.out.println("Greater than ");	
		}
		int i=2; int o=3;if(i<o) {
			System.out.println("Smaller than ");	
		}
		int p=4;int j=4;if(p>=j) {
			System.out.println("Greater than eqaul to ");	
		}
		int f=6;int h=6; if(f<=h) {
			System.out.println("Smaller than equal to ");	
		}
		
		
		//3.logical Operators
		//And
		int l=12;int k=9;
		if(l==12 && k==9) {
			System.out.println("And");
		}
		//Or
		if(l==1||k==9) {
			System.out.println("Or");
		}
		//Not
		if(!(l!=12)) {
			System.out.println("Not");
		}
		//4.Unary Operators
		//increment and decrement Operator
		//pre increment
		int m=3;
		++m;//adds 1 in the same line
		System.out.println(m);
		//post increment
		int v=3;
		v++;System.out.println(v);//adds 1 in the next line
		
		//pre decrement
		int x=3;
		--x;//subtract 1 in the same line
		System.out.println(x);
		//post decrement
		int c=3;
		c--;System.out.println(c);//subtract 1 in the next line
		//5.Ternary Operators
		//condition operator
		int ff=12;int hh=13; int ll=10;
		int rr=((ff>hh)?((ff>ll)?f:l):((hh>ll)?hh:ll));
		System.out.println("The greatest number is = "+rr);
		//6.Bitwise Operators
		//And &
		int num1 = 12; int num2 = 7;
		if(num1==12 & num2 ==7) {
			System.out.println("equal");
		}else
		{
			System.out.println("not equal");
		}
		//Or |
		
		int num4 = 12; int num5 = 7;
		if(num4==12 | num5 ==9) {
		System.out.println("equal");
		}else
		{
		System.out.println("not equal");
		}
		//compliment ~
		int num6= 0101;
		System.out.println(~num6);
		//7.Shift operators[works with bits]
		//left shift operator<< 2 ,shift two digit to the left
		int ghj =2;
		int answer = ghj<<2;
		System.out.println(answer);		
		
		//right shift operator>>2 ,shift two digit to the right
		int jkl = 8;
		int ans = jkl>>2;
		System.out.println(ans);

	}

}
