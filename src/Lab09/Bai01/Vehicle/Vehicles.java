/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab09.Bai01.Vehicle;

import java.util.Scanner;

/**
 *
 * @author ducanh
 */
public class Vehicles implements IVehicle{
    protected String maker;
    protected String model;
    protected double price;

    public Vehicles() {
    }

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vehicle: ");
        System.out.print("(maker): ");
        maker = input.nextLine();
        System.out.print("(model): ");
        model = input.nextLine();
        System.out.print("(price): ");
        price = Double.parseDouble(input.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("Vehicle: %s, %s, %f", maker, model, price);
    }
    
}
