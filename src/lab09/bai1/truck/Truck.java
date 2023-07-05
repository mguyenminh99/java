package lab09.bai1.truck;

import lab09.bai1.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    public int truckLoad;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap truckload : ");
        truckLoad = Integer.parseInt(sc.nextLine());
    }

    public void display() {
        System.out.println("loai xe: ");
    }
}
