public class Solution3 {

	public int test(int[] A) {
		int intersections = 0;
		for(long i = 1; i < A.length ; i++) {
			for(long j = 0; j < i; j++) {
				if((i - A[(int) i]) <= (j + A[(int) j])) {
					intersections++;
				}
			}
		}
		return intersections;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1,5,2,1,4,0 };
		int[] B = new int[] {};
		int[] C = new int[] {1};
		int[] D = new int[] { 1,0 };
		Solution solution = new Solution();
		System.out.println(solution.test(A));
		System.out.println(solution.test(B));
		System.out.println(solution.test(C));
		System.out.println(solution.test(D));
	}
}
