import java.util.*;

public class exB4 {
  public static void main (String [] args) {
	String yourLanguage;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter give your language (NL,FR,EN or something else)");
	yourLanguage = scanner.nextLine();   
	  
	switch (yourLanguage) {
	case "NL": 
		System.out.println("Goeiedag!");
		break;
	case "FR": 
		System.out.println("Bonjour!");
		break;
	case "EN": 
		System.out.println("Good day!");
		break;
	default:
		System.out.println("Goeiedag, bonjour and good day!");
	}
  }
}

