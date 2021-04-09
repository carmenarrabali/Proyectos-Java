package org.pab2020.Fibonacci;

public class Fibonacci {
    /**
     * @param n = número de meses
     * @param k = número de parejas de conejos
     * @return Fn = número de conejos después de un número de generaciones.
     */
    public int fibonacci(int n, int k){
        if (n < 0){
            throw new RuntimeException("El mes no puede ser negativo.");
        }
        else if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            return (fibonacci(n-1,k) + k * fibonacci(n-2, k));
        }
    }
}