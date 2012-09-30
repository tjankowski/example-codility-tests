import static java.math.BigDecimal.valueOf;
import java.math.BigDecimal;


public class Solution5 {
	
	private static final int NO_RESULT = -1;

	public int extreme( int[] A ) {
	    if(A.length < 1) {
	    	return NO_RESULT;
	    }
	    BigDecimal average = computeAverage(A);
	    return findMaxDeviationPosition(A, average);
	  }
	
	private BigDecimal computeAverage(final int[] A) {
		BigDecimal average = BigDecimal.ZERO;
	    for(int element : A) {
	    	average = average.add(valueOf(element));
	    }
	    average = average.divide(valueOf(A.length));
	    return average;
	}
	
	private int findMaxDeviationPosition(final int[] A, BigDecimal average) {
		BigDecimal max = valueOf(-1);
	    int position = 0;
	    for(int index = 0; index < A.length; index++) {
	    	BigDecimal deviation = (valueOf(A[index]).subtract(average)).abs();
	    	if(max.compareTo(deviation) < 0) {
	    		max = deviation;
	    		position = index;
	    	}
	    }
	    return position;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 9, 4, -3, -10};
		int[] B = new int[] { 4 };
		int[] C = new int[] { 1, 1, -1, 1 };
		Solution solution = new Solution();
		System.out.println(solution.extreme(A));
		System.out.println(solution.extreme(B));
		System.out.println(solution.extreme(C));
	}
}
