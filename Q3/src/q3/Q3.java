package q3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Fibonacci fb = new Fibonacci();
        System.out.print("Enter a number(n):");
        int n = sc.nextInt();
        
        long rec = System.currentTimeMillis();
        System.out.println("Result Recursive: "+fb.FibRec(n));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis() - rec);
        
        long ite = System.currentTimeMillis();
        System.out.println("Result İterative :"+fb.fib(n));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis()-ite);
        
        long fast = System.currentTimeMillis();
        System.out.println("Result faster recursive: "+fb.getFibonacci(n));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis()-fast);
       
    }
}
