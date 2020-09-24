import java.util.*;

public class exB3 {
  public static void main (String [] args) {
	int [] intArray={1,2,4,8,16,32,64,128};
	int total = 0;
	double average;
	for (int intArrayElement: intArray) {
		total += intArrayElement;
	}
	average = (double) total / intArray.length;
	System.out.println("average=" + average);
  }
}
