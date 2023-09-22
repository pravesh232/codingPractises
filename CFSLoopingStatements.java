package codingPractise;

public class CFSLoopingStatements {

	public static void main(String[] args) {
		// TControl FLow Statements
		//Looping Statements
		//For Loop Statements(Forward)
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//For Loop Statements (Reversed)
		for(int i=10;i>=0;i--) {
			System.out.println(" "+i);
		}
		
		//Nested For loop Statements(Matrices)[Matrices is combination of rows and column]
		for(int i =0;i<=2;i++) {  // creates rows
			for(int j=0;j<=2;j++) { //creates column(Data is stored inside column)
				System.out.print(i+j+" ");} //add line break after inner loop to go to the next row
			System.out.println();
		}
		//Nested For loop Statements(Matrices)[Reversed]
				for(int i =2;i>=0;i--) {  // creates rows
					for(int j=0;j<=2;j++) { //creates column(Data is stored inside column)
						System.out.print(i+j+" ");} //add line break after inner loop to go to the next row
					System.out.println();
				}
		//While Loop Statements
				int i=1;
				while(i<=10) {
					System.out.print(" "+i);
					++i;
				}
		//do-while Loop Statements[used when atleast we want to execute the program once]
				int j=1;
				do{
					System.out.print("\n "+j+"\n");
					++j;
				}while(j<0);
		//For each Loop Statements //used in one-D arrays
				int a[]= {1,2,3};
				for(int b:a) {
					System.out.print(" "+b);
				}
		
	}

}
