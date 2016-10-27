// Fibonacci Sequence - Recursive - JAVA

public class main
{
  public static long fib(int n){
    if (n <= 1)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }

  public static void main(String[] args)
  {
    int k = 10;
    for (int i=0;i<=k;i++)
      System.out.printf("Fibonacci of %d is: %d\n", i, fib(i));
  }
}
