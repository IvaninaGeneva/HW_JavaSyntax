import java.util.Scanner;


public class formatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		if (0 <= a && a <= 500) {
			String col1 = String.format("%-10s", Integer.toHexString(a)).toUpperCase();
			String col2 = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
			String col3 = String.format("%10.2f",b);
			String col4 = String.format("%-10.3f",c);
			System.out.println("|"+col1+"|"+col2+"|"+col3+"|"+col4+"|");
		}
	}

}
