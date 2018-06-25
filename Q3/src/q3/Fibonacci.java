/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author sumeyyeozturk
 */
public class Fibonacci {
    public long getFibonacci(long n) { // faster recursive
        long[] f = new long[(int)(n + 1)];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[(int)n];
    }
    
    public long FibRec(int n){ //Recursive
        if (n <= 1)
            return n;
        return FibRec(n-1) + FibRec(n-2);
    }
    
    public int fib(int n) { //İterative
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
