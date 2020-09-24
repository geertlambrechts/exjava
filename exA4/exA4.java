import java.util.*;

public class exA4 {
  public static void main (String [] args) {
	  
     String courseTitle;
	 int courseNumberOfDays;
	 double coursePricePerDay;
	 String coursePriorKnowledge; 
	 List<String> courseInstructors = new ArrayList<String>();
	 double totalPrice;
	 double vat = 1.21;
	 
	 courseTitle = args[0];
	 courseNumberOfDays = Integer.parseInt(args[1]);
	 coursePricePerDay = Double.parseDouble(args[2]);
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
