package com.thinkinginjava.controllingExecution;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class E04_2 {
    //Sieve of Eratosthenes method for finding prime numbers

    public static void main(String[] args) {
        int max = 100;
        //get the max number from command args:
        if (args.length != 0) max = Integer.parseInt(args[0]);

        boolean[] sieve = new boolean[max + 1];
        int limit = (int) floor(sqrt(max));
        System.out.print(1 + " ");
        if (max > 1)
            System.out.print(2 + " ");
        //Detect prime numbers
        for (int i = 3; i <= limit; i += 2)   //primes can only be odd after 2
            if (!sieve[i])
                for (int j = 2 * 1; j <= max; j += i)
                    sieve[j] = true;
        //Print prime numbers
        for (int i = 3; i <= max; i += 2)
            if (!sieve[i])
                System.out.print(i + " ");
    }
}
