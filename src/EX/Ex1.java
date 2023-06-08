package EX;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một chuỗi:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        System.out.println("Các từ trong chuỗi:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
