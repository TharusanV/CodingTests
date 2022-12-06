package codility;

import java.util.ArrayList;
import java.util.Hashtable;

public class OddOccurencesInArray {
	
	public static int solution(int[] A) {
		ArrayList<Integer> leftOver = new ArrayList<>();
		
		for(int j=0; j<A.length; j++) {
			int value = A[j];
			if(leftOver.contains(value)){
				leftOver.remove(new Integer(value));
			}
			else {
				leftOver.add(value);
			}

		}
		return leftOver.get(0);
	}

	public static void main(String[] args) {
		int[] arrayEx = {1,1,3,2,3};
		System.out.println(solution(arrayEx));

	}

}
