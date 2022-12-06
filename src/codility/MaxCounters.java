package codility;

import java.util.Arrays;
import java.util.HashSet;

public class MaxCounters {
	
	public static int solution(int[] A) {
		Arrays.sort(A);
		int counter = 1;
		for(int i=0; i<A.length; i++) {
			if(A[i]<0) {
				return 1;
			}

			if(A[i] != counter){
				return counter;
			}
			counter++;
		}
		
		return A.length+1;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3}));

	}

}
