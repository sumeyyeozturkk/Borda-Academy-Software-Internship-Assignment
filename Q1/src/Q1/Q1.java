/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;



public class Q1 {

    public static void main(String[] args) {
        
        Location kitchen = new Location(10,20,"Kitchen");
        Location bathroom = new Location(40,70, "Bathroom");
        
        kitchen.Display();
        bathroom.Display();
        
        System.out.println("\n");
        
        kitchen.Point = bathroom.Point;
        
        kitchen.Display();
        bathroom.Display();
        
        System.out.println("\n");
        
        bathroom.Point.X += 25;
        bathroom.Point.Y += 25;
                
        kitchen.Display();
        bathroom.Display();
        
        System.out.println("\n");
        
        kitchen = bathroom;
        
        kitchen.Display();
        bathroom.Display();
        
        System.out.println("\n");
        
        kitchen.Point = bathroom.Point;
        
        kitchen.Display();
        bathroom.Display();
        
        System.out.println("\n");
        
        bathroom.Point.X += 25;
        bathroom.Point.Y += 25;
        
        kitchen.Display();
        bathroom.Display();
    }
    
}
