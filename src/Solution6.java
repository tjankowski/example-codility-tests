import java.util.HashMap;
import java.util.Map;

public class Solution6 {

	private static final int NO_RESULT = -1;

	public int arrLeader(int[] A) {
		int size = A.length;
		if(size < 1) {
			return NO_RESULT;
		}
		int min = (int) Math.floor(size / 2);
		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		for(int element : A) {
			addToMap(element, counter);
			if(checkCondition(min, element, counter)) {
				return element;
			}
		}
		return NO_RESULT;
	}
	
	private boolean checkCondition(final int min, final int element, Map<Integer, Integer> counter) {
		if(counter.containsKey(element) && counter.get(element) > min) {
			return true;
		}
		return false;
	}
	
	private Map<Integer, Integer> addToMap(final int element, Map<Integer, Integer> counter) {
		if(counter.containsKey(element)) {
			counter.put(element, (counter.get(element) + 1));
		} else {
			counter.put(element, 1);
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1,1,1 };
		int[] B = new int[] { 100,50,50,50,1 };
		int[] C = new int[] { 1 };
		Solution solution = new Solution();
		System.out.println(solution.arrLeader(A));
		System.out.println(solution.arrLeader(B));
		System.out.println(solution.arrLeader(C));
	}
}
