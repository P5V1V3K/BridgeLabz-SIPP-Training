import java.util.Scanner;
public class KMToMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		float miles=km*1.6f;
		System.out.println("The distance "+km+" in miles is "+ miles);
		
	}

}
