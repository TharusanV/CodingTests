package codility;

public class FrogJmp {
	
	public static int solution(int X, int Y, int D) {
		int distance = Y-X;
		int counter = (int) Math.ceil(distance / (double) D);
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(solution(60,85,30));

	}

}
