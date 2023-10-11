package LTHDT;

import java.util.Scanner;

public class bai7 {
	int n;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tính tổng các số từ 1 đến N");
			System.out.println("2. Tính tổng các số chẵn từ 2 đến N");
			System.out.println("3. Tính tổng các số lẻ từ 1 đến N");
			System.out.println("4. Tính tổng các số nguyên tố từ 1 đến N");
			System.out.println("5. In ra N số nguyên tố đầu tiên");
			System.out.println("6. Thoát");
			System.out.print("Chọn tùy chọn (1/2/3/4/5/6): ");
			int opt = sc.nextInt();

			int N;
			if (opt != 6) {
				System.out.print("Nhập N: ");
				N = sc.nextInt();
			} else {
				break;
			}

			switch (opt) {
			case 1:
				cauA(N);
				break;
			case 2:
				cauB(N);
				break;
			case 3:
				cauC(N);
				break;
			case 4:
				cauD(N);
				break;
			case 5:
				cauE(N);
				break;
			case 6:
				System.out.println("Thoát khỏi chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	public static void cauA(int num) {
		int sumAll = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			sumAll += i;
		}
		System.out.println("\nTong <=N :" + sumAll);
	}

	public static void cauB(int num) {
		int sumEven = 0;
		for (int i = 2; i <= num; i += 2) {
			System.out.print(i + " ");
			sumEven += i;
		}
		System.out.println("\nTong chan <=N :" + sumEven);
	}

	public static void cauC(int num) {
		int sumOdd = 0;
		for (int i = 1; i <= num; i += 2) {
			System.out.print(i + " ");
			sumOdd += i;
		}
		System.out.println("\nTong le <=N :" + sumOdd);
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void cauD(int num) {
		int sumPrime = 0;
		for (int i = 1; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				sumPrime += i;
			}
		}
		System.out.println("\nTong <=N :" + sumPrime);
	}

	public static void cauE(int num) {
		int cnt = 0;
		for (int i = 2; cnt < num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				cnt++;
			}
		}
	}
}