package LTHDT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bai8 {
	int n;
	int[] arr;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập kích thước của mảng: ");
		n = scan.nextInt();
		// Gọi hàm nhapmang để nhập mảng
		arr = Input(n, scan);
		// Xuất mảng đã nhập
		System.out.println("Mảng bạn vừa nhập là:");
		Output(arr);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
//    	  Output(arr);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tính tổng các phần tử trong mảng");
			System.out.println("2. Tính tổng các phần tử chẵn trong mảng");
			System.out.println("3. Tính tổng các phần tử lẻ trong mảng");
			System.out.println("4. Tính tổng các số nguyên tố trong mảng");
			System.out.println("5. Thêm một phần tử vào mảng");
			System.out.println("6. Xóa một phần tử khỏi mảng");
			System.out.println("7. Tìm phần tử trong mảng");
			System.out.println("8. Thoát");
			System.out.print("Chọn tùy chọn (1/2/3/4/5/6/7/8): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				if (arr != null) {
					System.out.println("Tổng các phần tử trong mảng: " + Caua(arr));
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 2:
				if (arr != null) {
					System.out.println("Tổng các phần tử chẵn trong mảng: " + Caub(arr));
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 3:
				if (arr != null) {
					System.out.println("Tổng các phần tử lẻ trong mảng: " + Cauc(arr));
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 4:
				if (arr != null) {
					System.out.println("Tổng các số nguyên tố trong mảng: " + Caud(arr));
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 5:
				if (arr != null) {
					System.out.print("Nhập giá trị muốn thêm vào mảng: ");
					int newValue = scan.nextInt();
					System.out.print("Nhập vị trí muốn thêm (0 - " + (arr.length) + "): ");
					int k = scan.nextInt();
					if (k >= 0 && k <= arr.length) {
						arr = themphantumoi(arr, newValue, k);
						System.out.println("Mảng sau khi thêm phần tử:");
						Output(arr);
					} else {
						System.out.println("Vị trí không hợp lệ.");
					}
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 6:
				if (arr != null) {
					System.out.print("Nhập vị trí muốn xoá (0 - " + (arr.length - 1) + "): ");
					int k = scan.nextInt();
					if (k >= 0 && k < arr.length) {
						arr = xoaPhanTu(arr, k);
						System.out.println("Mảng sau khi xoá phần tử:");
						Output(arr);
					} else {
						System.out.println("Vị trí không hợp lệ.");
					}
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 7:
				if (arr != null) {
					System.out.print("Nhập giá trị muốn tìm: ");
					int x = scan.nextInt();
					int pos = Cauf(arr, x);
					if (pos != -1) {
						System.out.println("Số " + x + " có trong mảng và nằm ở vị trí " + pos);
					} else {
						System.out.println("Số " + x + " không có trong mảng.");
					}
				} else {
					System.out.println("Mảng chưa được khởi tạo.");
				}
				break;
			case 8:
				System.out.println("Thoát khỏi chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	// phía trên là cách nhập và xuất nâng cao .
	public static int[] Input(int n, Scanner sc) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException("Kích thước mảng phải là một số nguyên dương.");
		}
		System.out.println("Nhập mảng:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void Output(int[] arr) {
		for (int number : arr) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static int Caua(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static boolean kiemTraphantuChan(int number) {
		return number % 2 == 0;
	}

	public static boolean kiemTraPhanTuLe(int number) {
		return number % 2 != 0;
	}

	public static int Caub(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (kiemTraphantuChan(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static int Cauc(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (kiemTraPhanTuLe(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static boolean IsPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int Caud(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (IsPrime(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	// Siêu cấp vip bro về mãng!!
//   public static int[] newArray2(int[] arr, int newValue) 
//    {
//    	//ArrayList<Integer> myList = new ArrayList<Integer>();
//    	ArrayList<Integer> myList = new ArrayList<>(); // Java tự suy ra kiểu dữ liệu Intege
//        List.add(newValue);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
	public static int[] themPhanTuLast(int[] arr, int newvalue) {
		int newSize = arr.length + 1;
		int[] newarr = new int[newSize];
		for (int i = 0; i < newSize - 1; i++) {
			newarr[i] = arr[i];
		}
		newarr[newSize - 1] = newvalue;
		return newarr;
	}

	// them 1 value tai vi tri index
//	public static int[] themphantumoi (int[] arr, int newvalue, int index) {
//		if (index < 0 || index > arr.length) {
//	        throw new IndexOutOfBoundsException("Vị trí index không hợp lệ.");
//	    }
//	    int newSize = arr.length +1 ;
//	    int[] newarr = new int[newSize];
//	    for (int i = 0, j = 0; i < newSize; i++) {
//	        if (i == index) {
//	            newarr[i] = newvalue;
//	        } else {
//	            newarr[i] = arr[j];
//	            j++;
//	        }
//	    }
//	    return newarr;
//	}
	public static int[] themphantumoi(int[] arr, int newvalue, int index) {
		if (index < 0 || index > arr.length) {
			throw new IndexOutOfBoundsException("Vị trí index không hợp lệ.");
		}
		int newSize = arr.length + 1;
		int[] newarr = new int[newSize];

		for (int i = 0, j = 0; i < newSize; i++) {
			if (i == index) {
				newarr[i] = newvalue;
			} else {
				newarr[i] = arr[j];
				j++;
			}
		}

		return newarr;
	}

	public static int[] xoaPhanTu(int[] arr, int k) {
		if (k < 0 || k >= arr.length) {
			System.out.println("Vị trí không hợp lệ.");
			return arr;
		}

		int newSize = arr.length - 1;
		int[] newarr = new int[newSize];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != k) {
				newarr[j] = arr[i];
				j++;
			}
		}

		return newarr;
	}

	public static int Cauf(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
}