import java.util.*;

public class ExC4 {
  public static void main (String [] args) {
    ExC4.welcomePerson();
  }
  
  static void welcomePerson () {
	String answer="Y";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome!");
	System.out.println("Would you like to be greeted again? (Y/N)");
	answer = scanner.nextLine();
	answer = answer.toUpperCase();
	if (answer.equals("Y")) {
		ExC4.welcomePerson();
	}
	scanner.close();
  }
}

