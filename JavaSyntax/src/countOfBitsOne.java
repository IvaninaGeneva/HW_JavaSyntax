import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class countOfBitsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String binary = Integer.toBinaryString(a).replace(' ', '0');
		Pattern p = Pattern.compile("1");
		Matcher m = p.matcher(binary);
		int count = 0;
		while (m.find()){
			count+=1;
		}
		System.out.println(count);
	}

}
