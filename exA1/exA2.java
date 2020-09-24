import java.util.*;

public class exA2 {
  public static void main (String [] args) {
	  
     String courseTitle;
	 int courseNumberOfDays;
	 float coursePricePerDay;
	 String coursePriorKnowledge; 
	 List<String> courseInstructors = new ArrayList<String>();
	 
	 courseTitle = "Git Training";
	 courseNumberOfDays = 2;
	 coursePricePerDay = 200;
	 coursePriorKnowledge = "Command line in terminal";
	 courseInstructors.add ("Guy");
	 courseInstructors.add ("Sandy");
	 
	 
	System.out.println("course ");
	System.out.println("    Title                  : " + courseTitle);	
	System.out.println("    Number of Days         : " + courseNumberOfDays);	
	System.out.println("    price/day              : " + coursePricePerDay + " euro");
	System.out.println("    prior knowledge        : " + coursePriorKnowledge);	
	System.out.println("    Number of Instructors  : " + courseInstructors.size());	

  }
}
