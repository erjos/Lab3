import java.util.Scanner;

public class TableOfPowers {
	public static void main(String[] args) {
		//pair programming excercise to display a table of powers
		//prompts user to enter integer
		//app displays table of squares and cubes from 1 to the value entered
		//prompts user to continue
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		num = input.nextInt();
		
		System.out.println("Number\tSquared\tCubed");
		System.out.println("======\t=======\t======");
		
		for (int i = 1; i <= num; i++){
			System.out.println(i + "\t" + i * i + "\t" + i * i * i);
		}
	}
}
