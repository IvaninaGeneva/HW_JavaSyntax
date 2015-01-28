import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int xA = input.nextInt();
		int yA = input.nextInt();
		int xB = input.nextInt();
		int yB = input.nextInt();
		int xC = input.nextInt();
		int yC = input.nextInt();
		float Area = Math.abs((xA*(yB-yC) + xB*(yC-yA)+ xC*(yA-yB))/2);
		int roundArea = Math.round(Area);
			if (roundArea == 0) {
				System.out.println("0");
			} else {
				System.out.println(roundArea);
			}
	}

}
