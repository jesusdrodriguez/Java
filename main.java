
// Fibonacci Sequence - Recursive - JAVA

public class main
{
  public static long fibonacci(long number){
    if ((number == 0) || (number == 1))
      return number;
    else
      return fibonacci(number - 1) + fibonacci(number - 2);
  }

  public static void main(String[] args)
  {
    int k = 10;
    for (int i=0;i<=k;i++)
      System.out.printf("Fibonacci of %d is: %d\n", i, fibonacci(i));
  }
}
