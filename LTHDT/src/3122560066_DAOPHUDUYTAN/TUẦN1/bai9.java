package LTHDT;

import java.util.Scanner;

public class bai9 {
	String s;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi: ");
		s = scan.nextLine();
		StringBuilder stringBuilder = new StringBuilder(s);

	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder(s);
		int choice;
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Đếm số ký tự trong chuỗi");
			System.out.println("2. Loại bỏ khoảng trắng trong chuỗi");
			System.out.println("3. Đếm số từ trongD chuỗi");
			System.out.println("4. Hiển thị các từ trong chuỗi");
			System.out.println("5. Lấy ký tự bên trái của chuỗi");
			System.out.println("6. Lấy ký tự bên phải của chuỗi");
			System.out.println("7. Xuất n ký tự từ vị trí k trong chuỗi");
			System.out.println("0. Thoát");

			System.out.print("Chọn chức năng (0-7): ");
			choice = scan.nextInt();
			scan.nextLine(); // Đọc dòng trống sau khi đọc số

			switch (choice) {
			case 1:
				int length = Caua(stringBuilder);
				System.out.println("Câu a: " + length);
				break;
			case 2:
				Caub(stringBuilder);
				String resultCauB = stringBuilder.toString();
				System.out.println("Câu b: " + resultCauB);
				break;
			case 3:
				int wordCount = countWords(stringBuilder);
				System.out.println("Câu c: Trong chuỗi có " + wordCount + " từ");
				break;
			case 4:
				System.out.println("Câu c: Các từ trong chuỗi:");
				outputWords(stringBuilder);
				break;
			case 5:
				System.out.print("Nhập số k: ");
				int k1 = scan.nextInt();
				String result1 = getLeftmostCharacters1(s, k1);
				if (result1 != null) {
					System.out.println("Câu c.1: Ký tự bên trái của chuỗi s (k = " + k1 + "): " + result1);
				} else {
					System.out.println("Số k không hợp lệ.");
				}
				break;
			case 6:
				System.out.print("Nhập số k: ");
				int k2 = scan.nextInt();
				String result2 = getRightmostCharacters2(s, k2);
				if (result2 != null) {
					System.out.println("Câu c.2: Ký tự bên phải của chuỗi s (k = " + k2 + "): " + result2);
				} else {
					System.out.println("Số k không hợp lệ.");
				}
				break;
			case 7:
				System.out.print("Nhập số k: ");
				int k3 = scan.nextInt();
				System.out.print("Nhập số n: ");
				int n = scan.nextInt();
				Xuatntuk(s, k3 - 1, n);
				break;
			case 0:
				System.out.println("Chương trình đã thoát.");
				return;
			default:
				System.out.println("Chức năng không hợp lệ.");
			}
		}
	}

	public static int Caua(StringBuilder stringBuilder) {
		return stringBuilder.length(); // đếm từ 1;
	}

	public static void Caub(StringBuilder stringBuilder) {
		for (int i = 0; i < stringBuilder.length();) {
			if (stringBuilder.charAt(i) == ' ') {
				stringBuilder.deleteCharAt(i);
			} else {
				i++;
			}
		}
	}

	public static int countWords(StringBuilder stringBuilder) {
		String text = stringBuilder.toString();
		String[] words = text.split(" ");
		return words.length;
	}

	public static void outputWords(StringBuilder stringBuilder) {
		StringBuilder currentWord = new StringBuilder();
		for (int i = 0; i < stringBuilder.length(); i++) {
			char currentChar = stringBuilder.charAt(i);

			if (currentChar != ' ') {
				currentWord.append(currentChar);
			} else {
				if (currentWord.length() > 0) {
					System.out.println(currentWord);
					currentWord.setLength(0);
				}
			}
		}

		if (currentWord.length() > 0) {
			System.out.println(currentWord);
		}
	}

	public static String getLeftmostCharacters1(String s, int k) {
		if (k >= 0 && k <= s.length()) {
			return s.substring(0, k);
		} else {
			return null;
		}
	}

	public static String getRightmostCharacters2(String s, int k) {
		int length = s.length();
		if (k >= 0 && k <= length) {
			return s.substring(length - k, length);
		} else {
			return null;
		}
	}

	public static void Xuatntuk(String s, int k, int n) {
		String save = s.substring(k, n);
		System.out.println("n ki tu cua chuoi tu vi tri k: " + save);
	}
}
