import java.util.Scanner;

public class UocChungLonNhat2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

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
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);

    }
}
