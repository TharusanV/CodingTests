package codility;

import java.util.HashSet;

public class FrogRiverOne {
	
	public static int solution(int X, int[] A) {
		HashSet<Integer> list = new HashSet<Integer>();
		int counter = 0;
		for(int i = 0; i < A.length; i++) {
			if((!list.contains(A[i])) && A[i] <= X) {
				list.add(A[i]);
				counter++;
			}
			if(counter == X)
				return i;
			}

		return -1;
	}

	public static void main(String[] args) {
		int[] myNum = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(solution(1, myNum));
	}

}
