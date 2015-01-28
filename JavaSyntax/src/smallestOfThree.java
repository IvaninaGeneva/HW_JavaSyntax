import java.util.Arrays;
import java.util.Scanner;


public class smallestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		float z = input.nextFloat();
		float[] arr = {x,y,z};
		Arrays.sort(arr);
		System.out.println(arr[0]);

	}

}
