/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab09.Bai01.Vehicle.Truck;

import Lab09.Bai01.Vehicle.Vehicles;
import java.util.Scanner;

/**
 *
 * @author ducanh
 */
public class Truck extends Vehicles{
    private int truckLoad;

    public Truck() {
    }
    
    public int getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(int truckLoad) {
        this.truckLoad = truckLoad;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", %s\n", truckLoad);
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("(truck load): ");
        setTruckLoad(input.nextInt());
    }
    
    
}
