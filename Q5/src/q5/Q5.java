package q5;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Change c;
        int n, m,i,j = 0;
        String ch;
        String newCh;
     
        System.out.println("Enter a n and m:");
        String line = sc.nextLine();
        String[] nm = line.split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        
        System.out.println("Enter a i and j:");
        String line2 = sc.nextLine();
        String[] ij = line2.split(" ");
        i = Integer.parseInt(ij[0]);
        j = Integer.parseInt(ij[1]);
        
        System.out.println("Enter the characters to be changed:");
        ch = sc.next();
        System.out.println("\n");
        c = new Change(n,m,i,j,ch);   
        
        String[][] grid = new String[n][m]; 
        sc.nextLine();
        for (int k = 0; k < n; k++) {
            String ln = sc.nextLine();
            String[] stringNums = ln.split(" ");
            for (int l = 0; l < stringNums.length; l++) {
                grid[k][l] = stringNums[l];
            }
        }
        newCh = grid[i-1][j-1];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if(newCh.compareTo(grid[x][y])==0)     
                    grid[x][y] = ch;
            }
        }   
        System.out.println("\nNew Grid\n");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }     
    }
    
}
