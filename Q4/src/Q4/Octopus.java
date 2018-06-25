
package Q4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Octopus {
    private int n;
    private int m;
    private int[][] grid;
    private int[][] rearrangedGrid;
    private int rowNum1;
    private int rowNum2;

    public Octopus(int n) {
        this.n = n;
        this.m = (int)Math.sqrt(n);
    }
    
    public void printGrid(){
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print(this.grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public String predict(){
        Set rows = new HashSet();
        boolean hasDuplicate = false;
        List<Integer> predictions = new ArrayList();
        for (int item : this.grid[rowNum1-1]) {
            rows.add(item);
        }
        for (int item : this.rearrangedGrid[rowNum2-1]) {
            if (!rows.add(item)) {
                hasDuplicate = true;
                predictions.add(item);
            }
        }
        if(hasDuplicate && predictions.size() == 1)
            return predictions.get(0).toString();
        else if (hasDuplicate && predictions.size() > 1)
            return "Print “Magician failed”, if your program finds more than one possible teams.";
        else
            return "Print “Supporter cheated”, if your program does not find any card.";
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (m > 100)
            System.out.println("M 100'den büyük olamaz");
        else
            this.m = m;  
    }
    
    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int getRowNum1() {
        return rowNum1;
    }

    public void setRowNum1(int rowNum1) {
        this.rowNum1 = rowNum1;
    }

    public int getRowNum2() {
        return rowNum2;
    }

    public void setRowNum2(int rowNum2) {
        this.rowNum2 = rowNum2;
    }

    public int[][] getRearrangedGrid() {
        return rearrangedGrid;
    }

    public void setRearrangedGrid(int[][] rearrangedGrid) {
        this.rearrangedGrid = rearrangedGrid;
    }
    
    
    
    
}
