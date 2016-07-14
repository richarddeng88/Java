/**
 * For a given number, determines whether or not it is prime.
 *
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class is_Prime {
	public boolean isPrime(int num) {
		int div = 2;
		if (num == 2) {
			return true;
		}
		while (true) {
			if (num % div == 0) {
				return false;
			}
			if (div > Math.sqrt(num)) {
				break;
			}
			div = div + 1;
		}
		return true;
	}

	public void testPrimes() {
		RangeResource rr = new RangeResource(2, 500);
		for (int value : rr.sequence()){
			if (isPrime(value)) {
				System.out.println(value + "\t is prime");
			}
		}
	}
	
	public void test_a_int(int num) {
			if (isPrime(num)) {
				System.out.println(num + "\t is prime");
			}
		}
	}


