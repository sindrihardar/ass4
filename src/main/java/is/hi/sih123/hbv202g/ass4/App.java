package is.hi.sih123.hbv202g.ass4;

import org.apache.commons.numbers.primes.Primes;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int number = 123456789;
        int nextPrime = Primes.nextPrime(number);
        System.out.println("Next number after "+ number+ " is "+nextPrime );
    }
}
