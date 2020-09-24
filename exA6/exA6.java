import java.util.*;

public class exA6 {
  public static void main (String [] args) {
	  
	 int day;
	 String month;
	 int daysOfCurrentMonth;
	 int daysToGoInTheMonth;
	
	 HashMap <String, Integer> months = new HashMap<String, Integer>();
	 Scanner scanner = new Scanner(System.in);
     months.put("Januari", 31);
	 months.put("Februari", 28);
	 months.put("March", 31);
	 months.put("April", 30);
	 months.put("May", 31);
	 months.put("June", 30);
	 months.put("July", 31);
	 months.put("August", 31);
	 months.put("September", 30);
	 months.put("October", 31);
	 months.put("November", 30);
	 months.put("December", 31);
	 
	 System.out.println("Enter day");
     day = Integer.parseInt(scanner.nextLine());  
	 System.out.println("Enter month");
     month = scanner.nextLine();  
	 daysOfCurrentMonth = months.get(month);
	 daysToGoInTheMonth = daysOfCurrentMonth - day;
	 System.out.println ("days to go in " + month + " : " + daysToGoInTheMonth);
  }
}
