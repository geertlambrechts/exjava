import java.util.*;

public class DoMath {
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
