package lab09.bai1.test;

import lab09.bai1.IVehicle;
import lab09.bai1.Vehicle;
import lab09.bai1.car.Car;
import lab09.bai1.truck.Truck;

import java.util.*;

public class Test {
    List<Vehicle> cars = new ArrayList<>();
    Car car = new Car();
    List<Vehicle> trucks = new ArrayList<>();
    Truck truck = new Truck();
    List<List<? extends Vehicle>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test test = new Test();
        int type;
        do {
            System.out.println("1. input \n 2. Display \n 3. Sort by price \n 4. Search By Model \n 5.Exit");
            type = Integer.parseInt(sc.nextLine());
            System.out.println("Please select");
            switch (type){
                case 1 : test.inputCarAndTruck(); break;
                case 2 : test.showData(); break;
                case 3 : test.sortByPrice(); break;
                case 4 : test.searchByModel(); break;
                case 5 : break;
                default:
                    System.out.println("Nhap lai"); break;
            }
        } while (type != 5);

    }

    public void inputCarAndTruck(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i ++){
            System.out.println("Car Maker: ");
            String carMaker = sc.nextLine();
            System.out.println("Car Model: ");
            String carModel = sc.nextLine();
            System.out.println("Car Price: ");
            int carPrice = Integer.parseInt(sc.nextLine());
            car.input();
            car.setMaker(carMaker);
            car.setModel(carModel);
            car.setPrice(carPrice);
            cars.add(car);
            System.out.println("Truck Maker: ");
            String truckMaker = sc.nextLine();
            System.out.println("Truck Model: ");
            String truckModel = sc.nextLine();
            System.out.println("Truck Price: ");
            int truckPrice = Integer.parseInt(sc.nextLine());
            truck.input();
            truck.setMaker(truckMaker);
            truck.setModel(truckModel);
            truck.setPrice(truckPrice);
            trucks.add(truck);
        }
        System.out.println("nhap du lieu thanh cong");
    }

    public void showData(){
        list.add(cars);
        list.add(trucks);
        if (cars.isEmpty() && trucks.isEmpty()){
            System.out.println("danh sach rong");
        }else{
            for (List<? extends Vehicle> data : list){
                for (Vehicle vehicle : data){
                    System.out.println("Dữ liệu car and truck :");
                    System.out.println(vehicle);
                }
            }
        }
    }

    public void sortByPrice() {
        System.out.println("Dữ liệu car and truck :");
        cars.sort((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()));
        trucks.sort((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()));
        System.out.println(cars);
        System.out.println(trucks);
    }

    public void searchByModel() {
        if (cars.isEmpty()) {
            System.out.println("Danh sach xe trong.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap xe can tim: ");
            String model = scanner.next();

            boolean found = false;
            for (List<? extends Vehicle> data : list){
                for (Vehicle vehicle : data){
                    if (vehicle.getModel().equalsIgnoreCase(model)) {
                        System.out.println(vehicle);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("khong tim thay xe: " + model);
            }
        }
    }
}
