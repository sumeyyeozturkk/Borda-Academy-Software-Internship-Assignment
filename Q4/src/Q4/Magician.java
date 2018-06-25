
package Q4;

import java.util.Scanner;


public class Magician {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Octopus o;
        int n = 0;
        
        System.out.println("Enter number n:");
        
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }else
            System.out.println("Lutfen integer giriniz.");
        o = new Octopus(n);
        
        System.out.println("Enter the grid:");
        // asking to user for the grid
        int[][] grid = new int[o.getM()][o.getM()]; 
        sc.nextLine();
        for (int i = 0; i < o.getM(); i++) {
            String line = sc.nextLine();
            String[] stringNums = line.split(" ");
            for (int j = 0; j < stringNums.length; j++) {
                grid[i][j] = Integer.parseInt(stringNums[j]);
            }
        }
        o.setGrid(grid);
        //o.printGrid();
        
        System.out.println("Enter the first row number:");
        // asking for row number of the users team
        int rn = sc.nextInt();
        o.setRowNum1(rn);
        
        int[][] rearrangedGrid = new int[o.getM()][o.getM()]; 
        System.out.println("Enter the rearranged grid:");
        // asking to user for the rearranged grid
        sc.nextLine();
        for (int i = 0; i < o.getM(); i++) {
            String line = sc.nextLine();
            String[] stringNums = line.split(" ");
            for (int j = 0; j < stringNums.length; j++) {
                rearrangedGrid[i][j] = Integer.parseInt(stringNums[j]);
            }
        }
        o.setRearrangedGrid(rearrangedGrid);
        //o.printGrid();
        
        System.out.println("Enter the second row number:");
        // asking for second row number of the users team
        rn = sc.nextInt();
        o.setRowNum2(rn);
        
        System.out.println(o.predict());
    }
    
}
