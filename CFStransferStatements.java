package codingPractise;

public class CFStransferStatements {

	public static void main(String[] args) {
		// Control Flow Statements 
		//3. Transfer FLow statements
		//break; [Terminates the statement]
		for(int i=1;i<=5;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		//continue[Skip the statement]
		for(int i=1;i<=5;i++){
			if(i==4) {
				continue;
			}System.out.println(i);
		}
		
		//return [returns the value of the statement]
		System.out.print(addi(12,13));

	}
	static int addi(int a,int b) {
		int c=a+b; //Here return Transfer statement is done through method 
		return c;
	}
}
