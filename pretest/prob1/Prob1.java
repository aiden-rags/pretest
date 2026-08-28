package prob1;

public class Prob1 {

	public static void main(String[] args) {
		int[] numbers = {};
		int max;
		
		max = findMaxDifference(numbers);
		System.out.printf("Max is %d\n", max);

	}
	
public static int findMaxDifference(int[] theArray) {
//Finds the max difference between adjacent pairs in an array.
	
	int max = 0;
	int index;
	int diff;
	
	for(index=0; index<theArray.length-1; index++) {
		diff = theArray[index] - theArray[index+1];
		if(diff < 0) {
			diff = diff * -1;
		}
		if(diff > max) {
			max = diff;
		}
	}
	
	return max;	
	}

}
