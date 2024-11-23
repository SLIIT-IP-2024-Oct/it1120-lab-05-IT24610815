import java.util.Scanner;

public class IT24610815Lab5Q3 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double Total_Amount;
		double discount;
		
		System.out.print("Enter Start Date : ");
		int start_date = input.nextInt();
		System.out.print("Enter end Date : ");
		int end_date = input.nextInt();
		
		if (start_date>=1 && start_date<=31 && end_date>=1 && end_date<=31 && start_date<end_date){
			System.out.println("Room Charge Per Day : 48000.0/= ");
			int reserved_days = end_date - start_date;
			System.out.println("Number of Days Reserved : "+reserved_days);
			
			if (reserved_days<3){
				Total_Amount = 48000.0*reserved_days;
				System.out.println("Total Amount to be paid : "+Total_Amount);
				}
			
			else if (reserved_days<5){
				Total_Amount = (48000.0*reserved_days);
				discount = Total_Amount*10.0/100;
				Total_Amount = Total_Amount - discount;
				System.out.println("Total Amount to be paid : "+Total_Amount);
				}
			else {
				Total_Amount = (48000.0*reserved_days);
				discount = Total_Amount*20.0/100;
				Total_Amount = Total_Amount - discount;
				System.out.println("Total Amount to be paid : "+Total_Amount);
				}
			}
		else{
			System.out.println("Invalid Input");
			}
	}
}

