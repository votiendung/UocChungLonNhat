import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println(" khong co uoc chung ");
        }

        if (a < b) {
            for (int i = a; i > 0; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    System.out.println(" uoc chung lon nhat la:" + i);
                    break;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    System.out.println(" uoc chung lon nhat la:" + i);
                    break;
                }
            }
        }
    }
}