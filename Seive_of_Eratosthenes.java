//1)Seive of eratosthenes 
import java.util.*;
class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n)
    {
        /* Creating a boolean array "prime[0..n]" and
         and initializing all entries  as true. A value in
         primeNumber[i] will finally be false if i is Not a
         prime, else true.*/
        boolean primeNumber[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            primeNumber[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
            /* If prime[p] is not changed, then it is a
             prime*/
            if (primeNumber[p] == true) {
                /* Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.*/
                for (int i = p * p; i <= n; i += p)
                    primeNumber[i] = false;
            }
        }
 
        // Printing all prime numbers
        for (int i = 2; i <= n; i++) {
            if (primeNumber[i] == true)
                System.out.print(i + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last number of the range:");
        int n=sc.nextInt();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n+" : ");
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}















