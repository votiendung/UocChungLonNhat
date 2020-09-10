import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        System.out.println("nhap so tien gui");
        money = sc.nextDouble();

        System.out.println("nhap so thang gui");
        month = sc.nextInt();

        System.out.println("nhap lai suat");
        interset_rate = sc.nextDouble();

        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money*month*(interset_rate/12/100);
        }
        System.out.println(" lai suat nhan duoc: " + total_interset);
    }
}
