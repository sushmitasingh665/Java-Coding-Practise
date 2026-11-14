import java.math.BigInteger;
class Binomial{

    public static void main(String args[])
    {
      int n=5;
        int r=2;
        System.out.println("factorial of a number "+n+ " is equal to\t"+factorial(n));
        bincoefficient(n,r);
    }

    public static BigInteger factorial(int n)
    { BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
            fact=fact.multiply(BigInteger.valueOf(i));
      return(fact);
    }

    public static void bincoefficient(int n,int r)
    {
             BigInteger a=factorial(n);
            BigInteger b=factorial(r);
          BigInteger c=factorial(n-r);
        System.out.println(" Binominal coefficient formula was n!/r!(n-r)! \t="+ (a.divide(b.multiply(c))));
    }
}

/* OUT put
    factorial of a number 5 is equal to	120
 Binominal coefficient formula was n!/r!(n-r)! 	=10
*/
