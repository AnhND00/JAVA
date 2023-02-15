/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab09.Bai01.Vehicle.Test;

import Lab09.Bai01.Vehicle.Car.Car;
import Lab09.Bai01.Vehicle.Truck.Truck;
import Lab09.Bai01.Vehicle.Vehicles;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ducanh
 */
public class Test {

    private static List<Car> cars = new ArrayList<>();
    private static List<Truck> trucks = new ArrayList<>();
    private static List<Vehicles> vehicles = new ArrayList<>();

    public static void choose() {
        System.out.println("----------------------");
        System.out.println("1. Input");
        System.out.println("2. Display");
        System.out.println("3. Sort by price");
        System.out.println("4. Search by model");
        System.out.println("5. Exit");
        System.out.println("----------------------");
        Scanner input = new Scanner(System.in);
        int n;
        boolean check = false;
        do {
            System.out.print("Vui long chon so theo danh sach: ");
            n = input.nextInt();
            switch (n) {
                case 1: {
                    Case1();
                    check = true;
                    break;
                }
                case 2: {
                    Case2();
                    check = true;
                    break;
                }
                case 3: {
                    Case3();
                    check = true;
                    break;
                }
                case 4: {
                    String model = "";
                    System.out.print("Nhap model can tim: ");
                    input.nextLine();
                    model = input.nextLine();
                    Case4(model);
                    check = true;
                    break;
                }
                case 5: {
                    check = true;
                    System.exit(0);
                }

            }
        } while (check == false);
    }

    public static void Case1() {
        System.out.println("Nhap 3 CARS:");
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            car.input();
            cars.add(car);
        }
        System.out.println("Nhap 3 TRUCKS: ");
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.input();
            trucks.add(truck);
        }
        choose();
    }

    public static void Case2() {
        if(cars.size() == 0 || trucks.size() == 0){
            System.out.println("Chua co thong tin! Vui long nhap!");
            Case1();
        }
        else{
            System.out.println("Thong tin 3 CARS: ");
            cars.forEach(car -> car.display());
            System.out.println("\nThong tin 3 TRUCKS:");
            trucks.forEach(truck -> truck.display());
            choose();
        }
    }

    public static void Case3() {
        if(cars.size() == 0 || trucks.size() == 0){
            System.out.println("Chua co thong tin! Vui long nhap!");
            Case1();
        }
        else{
            System.out.println("Danh sach xe chua sap xep: ");
            cars.forEach(car -> car.display());
            trucks.forEach(truck -> truck.display());
            System.out.println("Danh sach xe sau khi sap xep theo gia: ");
            vehicles.addAll(cars);
            vehicles.addAll(trucks);
            vehicles.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
            vehicles.forEach(vehicle -> vehicle.display());
            choose();
        }
    }

    public static void Case4(String model) {
        if(cars.size() == 0 || trucks.size() == 0){
            System.out.println("Chua co thong tin! Vui long nhap!");
            Case1();
        }
        else{
            List<Vehicles> modelVehicle = new ArrayList<>();
            modelVehicle = vehicles
                    .stream()
                    .filter(v -> v.getModel().toLowerCase().equals(model.toLowerCase()))
                    .collect(Collectors.toList());
            modelVehicle.forEach(mV -> mV.display());
            if(modelVehicle.size() == 0){
                System.out.println("Khong co Model: " + model);
            }
            choose();
        }
    }

    public static void main(String[] args) {
        choose();
    }
}
