import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Bai2 {
    public static void main(String[] args) {
        Set<String> listCity = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập tên của các thành phố:");
        for (int i = 0; i < n; i++) {
            System.out.print("Thành phố thứ " + (i + 1) + ": ");
            String cityName = scanner.nextLine();
            listCity.add(cityName);
        }

        System.out.println("Danh sách thành phố: ");
        for (String city : listCity) {
            System.out.println(city);
        }

        List<String> listCityAsc = new ArrayList<>(listCity);
        Collections.sort(listCityAsc);
        System.out.println("Danh sách thành phố sắp xếp tăng dần:");
        for (String city : listCityAsc) {
            System.out.println(city);
        }
    }
}
