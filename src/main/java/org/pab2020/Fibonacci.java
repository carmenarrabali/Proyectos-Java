package org.pab2020;

public class Fibonacci {
    /**
     *
     * @param n = número de meses
     * @return Fn = número de conejos después de un número de generaciones.
     */
    public int fibonacci(int n){
        int k = 0;
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
            return (fibonacci(n-1) + k * fibonacci(n-2));
        }
    }
}