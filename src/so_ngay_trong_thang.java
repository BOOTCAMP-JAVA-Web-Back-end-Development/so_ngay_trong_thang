import java.util.Scanner;

public class so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("Nhập vào tháng: ");
        m = sc.nextInt();
        if (m < 1 || m > 12) {
            System.out.println("Không có tháng nào như vậy");
        } else {
            String day;
            switch (m) {
                case 2:
                    day = "28 or 29";
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = "31";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = "30";
                    break;
                default:
                    day = "";
                    }
            System.out.println("Tháng " + m + " có: " + day + " ngày");
        }
    }
}
