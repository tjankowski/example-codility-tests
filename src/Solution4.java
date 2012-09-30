import java.util.HashSet;
import java.util.Set;


public class Solution4 {
	
	private static final int NO_RESULT = -1;

	public int arrayJmp(int[] A) {
		int jumps = 0;
		long size = A.length;
		long position = 0;
		Set<Long> visitedPositions = new HashSet<Long>();
		visitedPositions.add(position);
		while(position < size) {
			position = position + A[(int) position];
			if(visitedPositions.contains(position)) {
				return NO_RESULT;
			}
			visitedPositions.add(position);
			jumps++;
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 2, 3, 1, 1, 3 };
		int[] B = new int[] {  };
		int[] C = new int[] { 1, 1, -1, 1 };
		Solution solution = new Solution();
		System.out.println(solution.arrayJmp(A));
		System.out.println(solution.arrayJmp(B));
		System.out.println(solution.arrayJmp(C));
	}
}
