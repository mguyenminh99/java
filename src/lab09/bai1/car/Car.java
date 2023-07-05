package lab09.bai1.car;

import lab09.bai1.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    public String color;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap color: ");
        color = sc.nextLine();
    }

    public void display() {
        System.out.println("Xe co mau "+ color);
    }
}
