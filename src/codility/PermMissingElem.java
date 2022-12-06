package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PermMissingElem {
	
	public static int solution(int[] A) {
		
		HashSet<Integer> missing = new HashSet<>();
		
		for(int i=1; i<=A.length+1; i++) {
			missing.add(i);
		}
		
		for(int i=0; i<A.length; i++) {
			missing.remove((Integer)A[i]);
		}
		
		return missing.iterator().next();
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,3,1,5}));
		System.out.println(solution(new int[] {}));
	}

}
