package codingPractise;
	import java.util.Scanner;
import java.util.Arrays;
public class ArraysinJava {

	public static void main(String[] args) {
		// This is an example of arrays in java
		//Array in java
		//This is an example of 1 dimensional array
		/*int[] array11= {5,8,9,2,1,0,45}; //for displaying the output of one dimensional array we use for each loop statement
		for(int b:array11) {
			System.out.print(" "+b);
		}
		Arrays.sort(array11);*/
		Scanner sc= new Scanner(System.in);
	/*	int array2[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number = ");
			int r=sc.nextInt();
			array2[i]=r;
			}
		for(int b:array2) {
			System.out.print(" "+b);
		}
		Arrays.sort(array2);
		for(int b:array2) {
			System.out.print(" "+b);
			
		}
		
		//This is an example of 2d array //it will works as metrices
		*/
		int array[][] = new int[3][3];
		for(int i=0;i<3;i++) {                    //input
			for(int j=0;j<3;j++) {
				System.out.println("Enter a number");
				int r=sc.nextInt();
				array[i][j]=r;
				
			}
		}
					//output
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
