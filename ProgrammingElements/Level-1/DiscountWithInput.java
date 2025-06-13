import java.util.Scanner;
public class DiscountWithInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee=sc.nextInt();
		float discountPercent=sc.nextFloat();
		float discount=(fee*discountPercent)/100f;
		float newFee=fee-discount;
		System.out.println("The discount is INR "+discount+" and final discounted fee is INR "+newFee);
	}

}
