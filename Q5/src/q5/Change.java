/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author sumeyyeozturk
 */
public class Change {
    private int n;
    private int m;
    private int i;
    private int j;
    String ch;
    private int[][] grid;

    public Change(int n, int m, int i, int j,String ch) {
        this.n = n;
        this.m = m;
        this.i = i;
        this.j = j;
        this.ch = ch;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        if (n > Math.pow(10, 4)) {
            System.out.println("N 10^4'den büyük olamaz");
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
        if (m > Math.pow(10, 4)) {
            System.out.println("M 10^4'den büyük olamaz");
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }
    
    
    
    
    
}
