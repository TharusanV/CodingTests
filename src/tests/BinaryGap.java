package tests;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryGap {
	
	public static int solution(int N) {
		String value = Integer.toBinaryString(N);
		ArrayList<Integer> gapValues = new ArrayList<>();
		int counter = 0;

		for (int i=0; i<value.length(); i++) {
			if(value.charAt(i) == '0') {
				counter += 1;
			}
			else {
				gapValues.add(counter);
				counter = 0;
			}
		}
		
		return Collections.max(gapValues);
	}

	public static void main(String[] args) {
		System.out.println(solution(1041));
	}

}
