import java.util.Scanner;


public class PointsInsideHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		float x1 = 12.5f, y1 = 8.5f;
		float x2 = 22.5f, y2 = 8.5f;
		float x3 = 17.5f, y3 = 3.5f;
		
		float ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		float ABP = Math.abs (x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		float APC = Math.abs (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		float PBC = Math.abs (x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

		boolean isInTriangle = ABP + APC + PBC == ABC;
		
		if ( isInTriangle ==true) {
			System.out.println("Inside");
		} else 
			if ((x >= 12.5) && (x <= 17.5) && (y >= 8.5) && (y <= 13.5)) {
			System.out.println("Inside");
		} else 
			if ((x >= 20) && (x <= 22.5) && (y >= 8.5) && (y <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

}
