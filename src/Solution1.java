import java.util.HashSet;
import java.util.Set;

public class Solution1 {

	public int equi(int[] A) {
		Set<Integer> list = new HashSet<Integer>();
		int position = 0;
		int skip = 0;
		for(int el : A) {
			if(list.contains(el)) {
				skip++;
				continue;
			} else {
				position += skip;
				skip = 0;
				list.add(el);
			}
		}
		return list.size() - 1 + position;
	}
	
	public static void main(String[] args) {
		int[] A = new int[]{2,2,1,0,1};
		int[] B = new int[]{1};
		int[] C = new int[]{0,1,1,0,1};
		Solution solution = new Solution();
		System.out.println(solution.equi(A));
		System.out.println(solution.equi(B));
		System.out.println(solution.equi(C));
	}
}
