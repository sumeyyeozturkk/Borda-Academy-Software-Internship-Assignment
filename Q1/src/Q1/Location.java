/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author sumeyyeozturk
 */
public class Location {
    Point Point;
    String Name;

    public Location(int X, int Y, String Name) {
        this.Point = new Point();
        this.Point.X = X;
        this.Point.Y = Y;
        this.Name = Name;
    }
    
    public void Display(){
        System.out.println("X:" + Point.X + " Y:" + Point.Y + " Name: " + Name);
    } 
}
