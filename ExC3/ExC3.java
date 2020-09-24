import java.util.*;

public class ExC3 {
  public static void main (String [] args) {
	int [] intArray={1,2,4,8,16,32,64,128};
    
	System.out.println("average=" + ExC3.calculateAverage(intArray));
  }
  
  static double calculateAverage (int [] pIntArray) {
	int total = 0;
	double average;
	for (int intArrayElement: pIntArray) {
		total += intArrayElement;
	}
	average = (double) total / pIntArray.length;
	return average;
  }
} 
