import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> listCountry = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n quốc gia: ");
        int n = scanner.nextInt();

        System.out.println("Nhập tên các quốc gia: ");
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Quốc gia thứ " + i + ": ");
            String name = scanner.nextLine();
            listCountry.put(i, name);
        }

        System.out.println("Danh sách quốc gia: ");
        for (Map.Entry<Integer, String> entry : listCountry.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        List<Map.Entry<Integer, String>> ascCountry = new ArrayList<>(listCountry.entrySet());
        ascCountry.sort(Map.Entry.comparingByValue());
        System.out.println("Danh sách quốc gia asc theo tên:");
        for (Map.Entry<Integer, String> entry : ascCountry) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
