import java.util.*;

public class ExC1 {
  public static void main (String [] args) {
	  
     String courseTitle;
	 int courseNumberOfDays;
	 double coursePricePerDay;
	 String coursePriorKnowledge; 
	 String label;
	 List<String> courseInstructors = new ArrayList<String>();
	 double totalPrice;
	 double vat = 1.21;
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter title");
     courseTitle = scanner.nextLine();   
	 System.out.println("Enter number of days");
     courseNumberOfDays = Integer.parseInt(scanner.nextLine());   
	 System.out.println("Enter Price per day");
	 coursePricePerDay = Double.parseDouble(scanner.nextLine());
	 System.out.println("Enter Prior Knowledge");
	 coursePriorKnowledge = scanner.nextLine(); 
	 courseInstructors.add ("Guy");
	 courseInstructors.add ("Sandy");
	 totalPrice = coursePricePerDay * courseNumberOfDays;
	 if (!(courseNumberOfDays > 3 && coursePriorKnowledge.length() > 0)) {
		totalPrice *= vat;
	 }
	 
	 if (totalPrice < 500) {
		 label = "CHEAP";
	 }
	 else { if (totalPrice > 1500) {
		      label = "EXPENSIVE";
			}
			else {
				label = "OK";
			}
	 }
	 
	 ExC1.printInfo(courseTitle, courseNumberOfDays, coursePricePerDay, coursePriorKnowledge, courseInstructors, totalPrice, label);
  }
	 

	static void printInfo(String pCourseTitle, int pCourseNumberOfDays, double pCoursePricePerDay, String pCoursePriorKnowledge, List<String> pCourseInstructors, double pTotalPrice, String pLabel) {
	 	System.out.println("course ");
		System.out.println("    Title                  : " + pCourseTitle);	
		System.out.println("    Number of Days         : " + pCourseNumberOfDays);	
		System.out.println("    price/day              : " + pCoursePricePerDay + " euro");
		System.out.println("    prior knowledge        : " + pCoursePriorKnowledge);	
		System.out.println("    Number of Instructors  : " + pCourseInstructors.size());	
		System.out.println("    total price            : " + pTotalPrice);
		System.out.println("    label                  : " + pLabel);
	}
}
