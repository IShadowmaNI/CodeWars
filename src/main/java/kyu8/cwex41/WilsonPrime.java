package kyu8.cwex41;

/*

Wilson primes satisfy the following condition. Let P represent a prime number.

Then ((P-1)! + 1) / (P * P) should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.

 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WilsonPrime {

    public static BigDecimal factorial(BigDecimal n) {

        if (n.compareTo(new BigDecimal("3")) < 0){
            return n;
        }

        return n.multiply(factorial(n.subtract(new BigDecimal("1"))));
    }

    public static boolean am_i_wilson(double n) {

        BigDecimal result;
        if (isPrime(n)){
            BigDecimal newN = new BigDecimal(n);
            result = ((factorial(newN.subtract(new BigDecimal("1"))).add(new BigDecimal("1")))).divide(newN.pow(2), 2) ;
        } else {
            return false;
        }

        return result.equals(result.setScale(0, RoundingMode.HALF_UP));
    }

    public static boolean isPrime(double n) {

        //check if n is a multiple of 2
        if (n%2==0 || n <= 1) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        double n = 567;
        System.out.println(isPrime(571));
        System.out.println(factorial(new BigDecimal(571)));

        BigDecimal x = new BigDecimal("324235.234235235325");
        System.out.println(x.setScale(5, BigDecimal.ROUND_HALF_UP));
        System.out.println(x.divide(new BigDecimal(13), BigDecimal.ROUND_HALF_UP));
    }
}
