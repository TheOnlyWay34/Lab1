package pkgMain;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input Years to work: ");
		float workyears = scan.nextFloat();
		System.out.println("Please input Annual Return interest while working: ");
		float workinterest = scan.nextFloat();
		System.out.println("Please input Years retired: ");
		float retireyears = scan.nextFloat();
		System.out.println("Please input Annual return interest while retired: ");
		float retireinterest = scan.nextFloat();
		System.out.println("Please input required monthly income while retired: ");
		float monthlyincome = scan.nextFloat();
		float monthlyssi = 3000;
		while (monthlyssi>2642){
			System.out.println("Please input monthly Social Security income: ");
			monthlyssi = scan.nextFloat();
		}
		
	}

}
