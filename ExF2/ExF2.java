import java.util.*;
import java.lang.*;
import java.io.*;

public class ExF2 {
  public static void main (String [] args) {
		Instructor instructor1 = new Instructor ("Geert", "Lambrechts", 52, 16, 1000);
		Instructor instructor2 = new Instructor ("Sandy", "Example", 65, 23, 2000);
		
		instructor2.printSalaryHistory();
  }
} 
