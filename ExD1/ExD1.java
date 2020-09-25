import java.util.*;
import java.lang.*;
import java.io.*;

public class ExD1 {
  public static void main (String [] args) {
	  
     String courseTitle;
	 int courseNumberOfDays=0;
	 double coursePricePerDay=0.0;
	 String coursePriorKnowledge; 
	 String label;
	 List<String> courseInstructors = new ArrayList<String>();
	 double totalPrice;
	 Scanner scanner = new Scanner(System.in);
	 boolean numberOK;
	 String instructor="";
	 BufferedReader in=null;
	 
	 System.out.println("Enter title");
     courseTitle = scanner.nextLine(); 
	 numberOK=false;	
	 do {	
		try {
			System.out.println("Enter number of days");
			courseNumberOfDays = Integer.parseInt(scanner.nextLine());   
			numberOK=true;
		}
		catch (NumberFormatException e1) {
			System.out.println("Please, enter an integer for the number of days \n");
		}
	 }
	 while (!numberOK);
	 
	 numberOK=false;
	 do {	
		try {
			System.out.println("Enter Price per day");
			coursePricePerDay = Double.parseDouble(scanner.nextLine()); 
			numberOK=true;
		}
		catch (NumberFormatException e1) {
			System.out.println("Please, enter a double for the price per days \n");
		}
	 }
	 while (!numberOK);
	 
	 System.out.println("Enter Prior Knowledge");
	 coursePriorKnowledge = scanner.nextLine(); 
	 scanner.close();
	 
	 // start read instructors-file
	 try {
		in = new BufferedReader(new FileReader("instructors.txt"));
	 }
	 catch (FileNotFoundException e1) {
			System.out.println("file instructors.txt not found");
			return;
	 }
	 
	 try {
		while ((instructor = in.readLine()) != null)
			courseInstructors.add(instructor);
	 }
	 catch (IOException e1) {
			System.out.println("Problem when reading the file instructors.txt");
			return;
	 }
	 
	 try {
	    in.close();
	 }
	 catch (IOException e1) {
		System.out.println("Error when closing the file instructors.txt");
		return;
	 }
	 // end read instructors-file	
		
	 System.out.println("instuctors : " + courseInstructors);


	 totalPrice = ExD1.priceCalculation(courseNumberOfDays, coursePricePerDay, coursePriorKnowledge);

	 if (totalPrice < 500) {
		 label = "CHEAP";
	 }
	 else if (totalPrice > 1500) {
	 	label = "EXPENSIVE";
	 }
	 else {
		label = "OK";
	 }
	
		 
	 ExD1.printInfo(courseTitle, courseNumberOfDays, coursePricePerDay, coursePriorKnowledge, courseInstructors, label);
  }
	 

	static void printInfo(String pCourseTitle, int pCourseNumberOfDays, double pCoursePricePerDay, String pCoursePriorKnowledge, List<String> pCourseInstructors, String pLabel) {
	 	System.out.println("course ");
		System.out.println("    Title                  : " + pCourseTitle);	
		System.out.println("    Number of Days         : " + pCourseNumberOfDays);	
		System.out.println("    price/day              : " + pCoursePricePerDay + " euro");
		System.out.println("    prior knowledge        : " + pCoursePriorKnowledge);	
		System.out.println("    Number of Instructors  : " + pCourseInstructors.size());	
 		System.out.println("    total price            : " + ExD1.priceCalculation(pCourseNumberOfDays, pCoursePricePerDay, pCoursePriorKnowledge));
		System.out.println("    label                  : " + pLabel);
	}
	
	static double priceCalculation(int pCourseNumberOfDays, double pCoursePricePerDay, String pCoursePriorKnowledge) {
		double totalPrice = pCourseNumberOfDays * pCoursePricePerDay;
		double vat = 1.21;
		if (!(pCourseNumberOfDays > 3 && pCoursePriorKnowledge.length() > 0)) {
			totalPrice *= vat;
		}
		return totalPrice;
	}
}
