import java.util.*;

public class exA5 {
  public static void main (String [] args) {
	  
     String courseTitle;
	 int courseNumberOfDays;
	 double coursePricePerDay;
	 String coursePriorKnowledge; 
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
	 coursePriorKnowledge = "Command line in terminal";
	 courseInstructors.add ("Guy");
	 courseInstructors.add ("Sandy");
	 totalPrice = coursePricePerDay * courseNumberOfDays * vat;
	 
	 
	System.out.println("course ");
	System.out.println("    Title                  : " + courseTitle);	
	System.out.println("    Number of Days         : " + courseNumberOfDays);	
	System.out.println("    price/day              : " + coursePricePerDay + " euro");
	System.out.println("    prior knowledge        : " + coursePriorKnowledge);	
	System.out.println("    Number of Instructors  : " + courseInstructors.size());	
    System.out.println("    total price            : " + totalPrice);
  }
}
