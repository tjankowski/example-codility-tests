public class Solution2 {

	private static final int NO_EQUILIBRIUM = -1;

	public int equi(int[] A) {
		long size = A.length;
		if (size < 1 || size > 10000000) {
			return NO_EQUILIBRIUM;
		}
		long sum = 0;
		for(int el : A) {
			sum += el;
		}
		long pre = 0;
		for (int position = 0; position < size; position++) {
			long post = sum - pre - A[position];
			if (pre == post) {
				return position;
			}
			pre += A[position];
		}
		return NO_EQUILIBRIUM;
	}
	
	public static void main(String[] args) {
		int[] A = new int[]{-7,1,5,2,-4,3,0};
		Solution solution = new Solution();
		System.out.println(solution.equi(A));
	}
}
