import java.util.Scanner;
public class Height {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float heightInCm=sc.nextFloat();
		float heightInInch=heightInCm/2.5f;
		float heightInFoot=heightInInch/heightInInch;
		System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFoot+" and inches is "+ heightInInch);
		sc.close();
	}

}
