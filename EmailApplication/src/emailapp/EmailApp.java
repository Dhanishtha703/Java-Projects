package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstName = sc.next();
		//sc.next();
		System.out.println("Enter your lastname");
		String lastName = sc.next();
		Email mail = new Email(firstName , lastName);
		System.out.println("=============================================================");
		System.out.println(mail.showInfo());
		
		System.out.println("=============================================================");
		System.out.println("Are you staisfy with these details??"); 
		System.out.println("if you wants to change according to your convenience...");
		System.out.println("=============================================================");
		System.out.println("If yes then type 'YES' ");
		System.out.println("If no then type 'NO' ");
		
		String choice = "/n";
		choice = sc.next();
		switch(choice){
		case "YES" :
			mail.showList();
			break;
			
		case "NO" :
			System.out.println("************Thanks For Joining Us!!**************");
			break;
			
		default:
			System.out.println("\"OOPS! Invalid option! Please try another option\"");
			break;
			
		}
	}

}
