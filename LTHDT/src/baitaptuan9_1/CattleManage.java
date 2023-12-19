package baitaptuan9_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CattleManage {
    private static List<Cattle[]> cattleList = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc =new Scanner(System.in) ;

        // Create a menu
        int menuChoice = 0;
        do {
            System.out.println("\nManage Cattle: ");
            System.out.println("\t1. Nhập loại gia súc.");
            System.out.println("\t2. In danh sách gia súc.");
            System.out.println("\t3. Gia súc trong trang trại kêu khi đói.");
            System.out.println("\t4. Số lượng mãng hiện có.");
            System.out.println("\t0. Thoát.");
            System.out.print("Nhập lựa chọn : ");
            menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    inputKindsOfCattles();
                    break;
                case 2:
                    printAllListCattles();
                    break;
                case 3:
                    makeAllCattlesToSay();
                    break;
                case 4:
                    presentArr();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Nhập lựa chọn không hợp lí!");
            }
        } while (menuChoice != 4);

        // Delete all cattles
        for (Cattle[] cattles : cattleList) {
            for (Cattle cattle : cattles) {
                cattle = null;
            }
        }
        System.out.println("Thanks!");
    }

    private static void inputKindsOfCattles() {
        Scanner sc =new Scanner(System.in) ;
        int catchKey;
        do {
            System.out.println("\t1. Nhập số lượng bò.");
            System.out.println("\t2. Nhập số lượng cừu.");
            System.out.println("\t3. Nhập số lượng dê.");
            System.out.println("\t4. Trỡ về trang chức năng.");

            System.out.print("Nhập lựa chọn: ");
            catchKey = sc.nextInt() ;

            switch (catchKey) {
                case 1:
                    int numberOfCows;
                    System.out.print("Nhập số lượng bò có trong trang trại: ");
                    numberOfCows =sc.nextInt() ;

                    // Create an array of cows
                    Cattle[] cows = new Cattle[numberOfCows];
                    for (int i = 0; i < numberOfCows; i++) {
                        cows[i] = new Cow();
                    }

                    // Add the array of cows to the cattle list
                    cattleList.add(cows);
                    break;
                case 2:
                    int numberOfSheep;
                    System.out.print("Nhập số lượng cừu có trong trang trại: ");
                    numberOfSheep = sc.nextInt() ;

                    // Create an array of sheep
                    Cattle[] sheep = new Cattle[numberOfSheep];
                    for (int i = 0; i < numberOfSheep; i++) {
                        sheep[i] = new Sheep();
                    }

                    // Add the array of sheep to the cattle list
                    cattleList.add(sheep);
                    break;
                case 3:
                    int numberOfGoats;
                    System.out.print("Nhập số lượng dê có trong trang trại: ");
                    numberOfGoats = sc.nextInt() ;

                    // Create an array of goats
                    Cattle[] goats = new Cattle[numberOfGoats];
                    for (int i = 0; i < numberOfGoats; i++) {
                        goats[i] = new Goat();
                    }

                    // Add the array of goats to the cattle list
                    cattleList.add(goats);
                    break;
                default:
                    break;
            }
        } while (catchKey != 4);
    }

    private static void printAllListCattles() {
        System.out.println("\n------Danh sách gia súc------");
        for (Cattle[] cattles : cattleList) {
            for (Cattle cattle : cattles) {
                cattle.print();
            }
        }
        System.out.println("--------------------------");
    }
    private static void makeAllCattlesToSay() {
        System.out.println("\n-----Kêu khi đói ----");
        for (Cattle[] cattles : cattleList) {
            for (Cattle cattle : cattles) {
                cattle.say();
            }
        }
        System.out.println("--------------------------");
    }
    private static void presentArr()
    {
        System.out.println("----Trang trại hiện có: ");
        for (Cattle[] cattles : cattleList) {
            for (Cattle cattle : cattles) {
                System.out.println(cattleList.size());
            }
        }
    }
    private static void exit() {
        System.out.println("Thoát thành công!!...");
    }
}
