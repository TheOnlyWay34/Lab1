package pkgMain;

import java.util.Scanner;

public class cMain {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please input Years to work: ");
		double workyears = scan.nextDouble();
		double workinterest = 21;
		while (workinterest > 20.0) {
			System.out.println("Please input Annual Return interest while working(0-20%): ");
			workinterest = scan.nextDouble();
		}
		System.out.println("Please input Years retired: ");
		double retireyears = scan.nextDouble();
		double retireinterest = 4;
		while (retireinterest > 3.0) {
			System.out.println("Please input Annual return interest while retired(0-3%): ");
			retireinterest = scan.nextDouble();
		}
		System.out.println("Please input required monthly income while retired: ");
		double monthlyincome = scan.nextDouble();
		double monthlyssi = 3000;
		while (monthlyssi > 2642.00) {
			System.out.println("Please input monthly Social Security income($0.00-2642.00): ");
			monthlyssi = scan.nextDouble();
		}
		double mworkinterest = (workinterest / 100) / 12;
		double mretireinterest = (retireinterest / 100) / 12;
		double monthlyneeded = monthlyincome - monthlyssi;
		double j = (1 + mretireinterest);
		double totalneeded = (((Math.pow(j, (retireyears * 12)) - 1) * monthlyneeded) / mretireinterest)
				/ Math.pow(j, (retireyears * 12));
		double monthlypayments = totalneeded
				/ ((Math.pow((1 + mworkinterest), (workyears * 12)) - 1) * (12 / (workinterest / 100)));
		System.out.printf("This means you must save a monthly total of $%.2f \n", monthlypayments);
		System.out.printf("To reach your total goal of $%.2f \n", totalneeded);
	}

}
