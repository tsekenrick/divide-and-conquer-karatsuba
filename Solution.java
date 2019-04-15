import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        int n = input.nextInt() + 1;
        
        int[] A = new int[n];
        int[] B = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            B[i] = input.nextInt();
        }
        
        int[] res = Solution.karatsuba(A, B, n);
        
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
    static int[] naiveMulti(int[] a, int[] b, int n) {
        int[] c = new int[(2 * n) - 1];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                c[i+j] = c[i+j] + a[i] * b[j];
            }
        }
        return c;
    }
    
    static int[] karatsuba(int[] a, int[] b, int n) {
        
        int[] a_hi = new int[n/2];
        int[] a_lo = new int[n/2];
        int[] b_hi = new int[n/2];        
        int[] b_lo = new int[n/2];
        
        int[] c = new int[(2 * n) - 1];
        
        // cutoff for naive approach
        if(n <= 8) {
            return naiveMulti(a, b, n);
        }
        
        for(int i = 0; i < n/2; i++) {
            a_lo[i] = a[i];
            b_lo[i] = b[i];
        }
        
        for(int i = n/2; i < n; i++) {
            a_hi[i - n/2] = a[i];
            b_hi[i - n/2] = b[i];
        }
        
        int[] t1 = new int[n/2];
        int[] t2 = new int[n/2];
        
        for(int i = 0; i < n/2; i++) {
            t1[i] = a_lo[i] + a_hi[i];
            t2[i] = b_lo[i] + b_hi[i];
        }
            
        int[] c_mid = karatsuba(t1, t2, n/2);
        int[] c_lo = karatsuba(a_lo, b_lo, n/2);
        int[] c_hi = karatsuba(a_hi, b_hi, n/2);        
    
        for(int i = 0; i < n-1; i++) {
            c[i] = c_lo[i];
        }
        
        c[n - 1] = 0;        
        for(int i = 0; i < n-1; i++) {
            c[n + i] = c_hi[i];
        }
        
        for(int i = 0; i < n-1; i++) {
            c[n/2 + i] += c_mid[i] - (c_lo[i] + c_hi[i]);
        }
        
        return c;
    }

}