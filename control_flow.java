package control_flow;
import java.util.*;
public class control_flow {

	public static void main(String[] args) {
		//getting input from user;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		
		// check the number is positive or negative or zero;
		int num = input.nextInt();
			if(num>0)
				System.out.println("Number " +num  + " is Positive");
			else if(num<0)
				System.out.println("Number " +num  + " is Negative");
			else
				System.out.println("Number " +num  + " is Zero");
		
		//days printing switch case;	
			switch(num) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;

		case 4:
			System.out.println("WEDNESDAY");
			break;

		case 5:
			System.out.println("THURSDAY");
			break;

		case 6:
			System.out.println("FRIDAY");
			break;

		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Number out of bound (Enter any number between 1-7 to show the day");

		}
			
			
		// if number is positive
		if(num>0) {
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		int safe= num;
		while(safe!=0) {
			System.out.print(safe+" ");
			safe-=1;
		}
		}
		//if number is negative;
		if(num<0) {
			for(int i= -1;i>=num;i--) {
				System.out.print(i+ " ");
			} 
			
			System.out.println("");
			
			while(num<=-1) {
				System.out.print(num+" ");
				num+=1;
			}
			
		}
		
		System.out.println("");
		
		//using do-while number one to three
		int number=1;
		do{
			System.out.print(number+ " ");
			number+=1;
		}while(number<=3);
	}

}
