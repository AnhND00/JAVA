/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab09.Bai01.Vehicle.Car;

import Lab09.Bai01.Vehicle.Vehicles;
import java.util.Scanner;

/**
 *
 * @author ducanh
 */
public class Car extends Vehicles{
    private String color;

    public Car() {
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void display() {
        super.display();
        System.out.printf(", %s\n", color);
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("(color): ");
        setColor(input.nextLine());
    }
    
}
