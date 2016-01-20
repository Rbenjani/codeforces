/**
 * 1A - Theatre Square
 */
import java.util.Scanner;

public class TheatreSquare {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		int area = input.nextInt();
		long flagstones = ((rows+area-1)/area) * ((cols+area-1)/area);
		System.out.println(flagstones);
	}
}