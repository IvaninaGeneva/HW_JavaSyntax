import java.util.Scanner;


public class deciToHexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		String hex = Integer.toHexString(x).toUpperCase();
		System.out.println("Hex value is " + hex);
	}

}
