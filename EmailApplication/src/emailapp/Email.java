package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int  defaultPasswordLength = 8;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String defaultCompanyName = "company.com";
	
	//constructor to receive firstName, lastNAme
	Email(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Welcome!! " + firstName + " " + lastName);
		
		//call a method that returns department
		this.department = setDepartment();
		System.out.println("So your department is : " + this.department);
		
		//call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + password);
		
		//combine elements in generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + defaultCompanyName;
		System.out.println("Your Email is : "+ email);
		
	}
	
	//Ask for the department
	
	private String setDepartment()
	{
		System.out.println("Department choice\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n ");
		System.out.println("Enter the code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		
		if(depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "Development";}
		else if(depChoice == 3) {return "Accounting";}
		else if(depChoice == 0) {return "None";}
		else {
			return "Please enter correct choice";
		}
	}
	
	//generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$&";
		char[] password = new char[length];
		for(int i=0;i<length ; i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity = capacity;
		System.out.println("NEW BOX CAPACITY IS : " + this.mailBoxCapacity + " mb");
	}
	
	//set the alternate email
	
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
		System.out.println("NEW EMAIL IS : " + this.alternateEmail);
	}
	
	//change the password 
	public void changePassword(String password)
	{
		this.password = password;
		System.out.println("NEW PASSWORD IS : " + this.password);
	}
	
	public String showInfo()
	{
		return "EMPLOYEE NAME :" + firstName + " " + lastName + 
				"\nCOMPANY EMAIL : " + email +
				"\nMAIL BOX CAPACITY : " + mailBoxCapacity + " mb";
	}
	
	public void showList()
	{
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome " + firstName);
		System.out.println("\n");
		System.out.println("A. Mail Box Capacity");
		System.out.println("B. Change Password");
		System.out.println("C. Alternate Email");
		System.out.println("D. Exit");
		
		
		do {
			System.out.println("=============================================================");
			System.out.println("Enter An Option");
			System.out.println("=============================================================");
			option = sc.next().charAt(0);
			
			switch(option)
			{
			 
			case 'A' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Enter capacity you wants to maintain");
				int boxCapacity = sc.nextInt();
				setMailBoxCapacity(boxCapacity);
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B' :
				System.out.println("------------------------------------------------------------");
				System.out.println("So you wants to chnage password");
				System.out.println("------------------------------------------------------------");
				String newPassword = sc.next();
				changePassword(newPassword);
				System.out.println("\n");
				break;
				
			case 'C' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Hey You Wants to generate an alternate email");
				System.out.println("------------------------------------------------------------");
				String newEmail = sc.next();
				setAlternateEmail(newEmail);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("You have successfully exit");
				break; 
				
			default :
				System.out.println("OOPS! Invalid option! Please try another option");
			}
		}while(option!='D');
		
	}
	
}

