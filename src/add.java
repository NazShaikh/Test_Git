import java.util.Scanner;


public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("enter two numbers for addition");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		int c =a+b;
		System.out.println("the addition is "+ c);
	}

}
