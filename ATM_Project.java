import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		int pin = 1234;
		double balance = 10000;
		double addAmount = 0;
		double takeAmount = 0;
		String name ;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("WELCOME TO THE ATM");
		System.out.println("Insert your debit Card");
		System.out.println("Enter Your Pin Number:");
		
		try {
			
			int password = sc.nextInt();
			
			if(password==pin) {
				System.out.println("Enter your name: \n");
				name = sc.next();
				System.out.println("Welcome: " + name);	
				
				while(true) {
					System.out.println("press 1: Check your Balance");
					System.out.println("press 2: Add Amount");
					System.out.println("press 3: Take Amount");
					System.out.println("press 4: EXIT!");
		            System.out.print("Enter your choice: ");

		            int option = sc.nextInt();
					
					switch(option) { 
						case 1:
							System.out.println("your current balance is " + balance + "\n");
							break;
						case 2:
							System.out.println("How much Amount did you want to add your account");
							addAmount = sc.nextInt();
							System.out.println("Successfully credited \n");
							balance += addAmount;
							break;
						case 3:
							System.out.println("How much amount did you want to take");
							takeAmount = sc.nextInt();
							
							if(balance<takeAmount){
								
								System.out.println("your balance is insufficient");
								System.out.println("try less than your available balance");
							}
							
							else {
								System.out.println("Successfully Taken \n");
								balance -= takeAmount;
							}
							break;
						case 4:
		                    System.out.println("Thank you for using the ATM.");
		                    break;
							
						default:
		                    System.out.println("Invalid choice. Please enter a valid option. \n");
	         				break;
					}
				}
				}
				else {
					System.out.println("Error: your pin number is Incorrect please check your pin number");
				}
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("Error: Invalid input.please enter valid pin number");
				}
				finally {
					sc.close();
				}
		}
	}
		
