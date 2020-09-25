import java.util.*;
import java.lang.*;
import java.io.*;

public class ExD2 {
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
		while ((instructor = in.readLine()) != null) {
			courseInstructors.add(instructor);
	    }
		in.close();
	 }
	 catch (FileNotFoundException e1) {
			System.out.println("file instructors.txt not found");
			return;
	 }
	 catch (IOException e1) {
			System.out.println("Problem when reading the file instructors.txt");
			System.out.println(e1.getMessage());
			return;
	 }
	 
	 // end read instructors-file	
	 

	 System.out.println("instuctors : " + courseInstructors);


	 totalPrice = ExD2.priceCalculation(courseNumberOfDays, coursePricePerDay, coursePriorKnowledge);

	 if (totalPrice < 500) {
		 label = "CHEAP";
	 }
	 else if (totalPrice > 1500) {
	 	label = "EXPENSIVE";
	 }
	 else {
		label = "OK";
	 }
	
		 
	 if (!(ExD2.printInfo(courseTitle, courseNumberOfDays, coursePricePerDay, coursePriorKnowledge, courseInstructors, label))) {
		 return;
	 }
  }
	 

	static boolean printInfo(String pCourseTitle, int pCourseNumberOfDays, double pCoursePricePerDay, String pCoursePriorKnowledge, List<String> pCourseInstructors, String pLabel) {
		boolean fileCorrectlyWritten = true;
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("courseinfo.txt"));
	  		out.write("    Title                  : " + pCourseTitle + "\n");	
			out.write("    Number of Days         : " + pCourseNumberOfDays + "\n");	
			out.write("    price/day              : " + pCoursePricePerDay + " euro" + "\n");
			out.write("    prior knowledge        : " + pCoursePriorKnowledge + "\n");	
			out.write("    Number of Instructors  : " + pCourseInstructors.size() + "\n");	
			out.write("    total price            : " + ExD2.priceCalculation(pCourseNumberOfDays, pCoursePricePerDay, pCoursePriorKnowledge) + "\n");
			out.write("    label                  : " + pLabel + "\n");
			out.close();
		}
        catch(IOException e1) {
		  System.out.println("Error writing file courseinfo.txt");
		  System.out.println(e1.getMessage());
		  fileCorrectlyWritten = false;
		  return fileCorrectlyWritten;
        }
        System.out.println("file courseinfo.txt created");
		return fileCorrectlyWritten;
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
