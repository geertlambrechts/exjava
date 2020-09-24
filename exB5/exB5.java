import java.util.*;

public class exB5 {
  public static void main (String [] args) {
	String answer="Y";
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("Welcome!");
		System.out.println("Would you like to be greeted again? (Y/N)");
		answer = scanner.nextLine(); 
	}
	while (answer.equals("Y"));
  }
}

