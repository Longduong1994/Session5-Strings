package EX;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập địa chỉ email:");
        String email = scanner.nextLine();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("Địa chỉ email hợp lệ.");
        } else {
            System.out.println("Địa chỉ email không hợp lệ.");
        }
    }

    private static boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]{3,9}+@[a-z0-9.-]+$";

        return email.matches(regex);
    }
}
