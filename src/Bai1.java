import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        System.out.println("Nhập List: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list.add(number);
        }

        System.out.println("Show list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);

        System.out.println("Show list asc: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}