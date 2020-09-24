public class exA1 {
  public static void main (String [] args) {
	  
     String [] CourseTitle = new String [3];
	 int [] CourseNumberOfDays = new int[3];
	 float [] CoursePricePerDay = new float [3];
	 String [] CoursePriorKnowledge = new String [3]; 
	 
	 CourseTitle [0] = "Git Training";
	 CourseNumberOfDays [0] = 2;
	 CoursePricePerDay [0] = 200;
	 CoursePriorKnowledge [0] = "Command line in terminal";
	 
	 CourseTitle [1] = "Java Training";
	 CourseNumberOfDays [1] = 20;
	 CoursePricePerDay [1] = 300;
	 CoursePriorKnowledge [1] = "basics programming";
	 
	 	 
	 CourseTitle [2] = "HTML and CSS";
	 CourseNumberOfDays [2] = 4;
	 CoursePricePerDay [2] = 250;
	 CoursePriorKnowledge [2] = "no prior knowledge required";
	 
	 for(int i=0; i< CourseTitle.length;i++) {
		System.out.println("course number " + (i+1));		  
		System.out.println("    Title            : " + CourseTitle[i]);	
		System.out.println("    Number of Days   : " + CourseNumberOfDays[i]);	
		System.out.println("    price/day        : " + CoursePricePerDay[i] + " euro");
		System.out.println("    prior knowledge  : " + CoursePriorKnowledge[i]);	
	 }		
  }
}
