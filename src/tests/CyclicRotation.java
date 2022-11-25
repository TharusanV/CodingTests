package tests;

public class CyclicRotation {
	
	public int[] solution(int[] A, int K) {
		for(int i=0; i<K; i++) {
			int lastPosValue = A[A.length-1];
            for(int j = A.length-1; j > 0; j--){        
                A[j] = A[j-1];    
            }
            A[0] = lastPosValue;
		}
		return A;
	}

	public static void main(String[] args) {
		
	}

}
