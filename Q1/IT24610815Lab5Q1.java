import java.util.Scanner;

public class IT24610815Lab5Q1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int num1,num2,num3,smallest,largest;
		System.out.println("Enter the first integer : ");
		num1 = input.nextInt(); 
		System.out.println("Enter the second integer : ");
		num2 = input.nextInt(); 
		System.out.println("Enter the third integer : ");
		num3 = input.nextInt(); 
		
		smallest = num1;
		largest = num1;

		if(num2<smallest){
		smallest = num2;
		}else if (num3<smallest){
		smallest = num3;
		}

		if(num2>largest){
		largest = num2;
		}else if (num3>largest) {
		largest = num3;
		}
		System.out.println("User entered numbers are : "+num1+","+num2+","+num3);
		System.out.println("The Smallest number is :"+smallest);
		System.out.println("The Largest number is :"+largest);
	}
}