import java.util.*;
import java.lang.*;
import java.io.*;

public class ExE1 {
  public static void main (String [] args) {
	String firstName;
	String lastName;
	int age=0;
	int ageStarted=0;
	double salaryStarted=0;
	boolean numberOK;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter first name");
    firstName = scanner.nextLine(); 
		
	System.out.println("Enter last name");
    lastName = scanner.nextLine(); 
	
	numberOK=false;	
	do {	
		try {
			System.out.println("Enter age");
			age = Integer.parseInt(scanner.nextLine());   
			numberOK=true;
		}
		catch (NumberFormatException e1) {
			System.out.println("Please, enter an integer for age \n");
		}
	}
	while (!numberOK);


	numberOK=false;	
	do {	
		try {
			System.out.println("Enter age started");
			ageStarted = Integer.parseInt(scanner.nextLine());   
			numberOK=true;
		}
		catch (NumberFormatException e1) {
			System.out.println("Please, enter an integer for age started \n");
		}
	}
	while (!numberOK);
	
	
	numberOK=false;
	do {	
		try {
			System.out.println("Enter starting salary");
			salaryStarted = Double.parseDouble(scanner.nextLine()); 
			numberOK=true;
		}
		catch (NumberFormatException e1) {
			System.out.println("Please, enter a double for the starting salary \n");
		}
	}
	while (!numberOK);
	
	ExE1.printSalaryHistory (firstName, age, ageStarted, salaryStarted);
	
  }

  static void printSalaryHistory (String firstname, int age, int ageStarted, double salaryStarted) {
	  final int MAX_SENIORITY = 35;
	  final double SALARY_INCREASE = 1.03;
	  final int INCREASE_PERIOD = 5;
	  int increasedAge = ageStarted;
	  double increasedSalary = salaryStarted;
	  int currentAge = age;
	  
	  try {
			BufferedWriter out = new BufferedWriter(new FileWriter("salaryhistory.txt"));
			
			while (increasedAge <= currentAge && (increasedAge - ageStarted) <= MAX_SENIORITY ) {
				out.write("Salary of " + firstname + " at " + increasedAge + " is " + increasedSalary + "\n");
				increasedAge += INCREASE_PERIOD;
				increasedSalary *= SALARY_INCREASE;
			}
			out.write("Maximum Salary reached");
			
			out.close();
			
	  }
	  catch(IOException e1) {
		  System.out.println("Error writing file courseinfo.txt");
		  System.out.println(e1.getMessage());
		  return;
      }

  }	  

} 
