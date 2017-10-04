package fpinscala.asagaama

object MyModule {

  def main(args: Array[String]): Unit = {
    println(formatAbs(-33))
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  // A definition of factorial, using a local, tail recursive function
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  // 0 and 1 are the first two numbers in the sequence,
  // so we start the accumulators with those.
  // At every iteration, we add the two numbers to get the next one.
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)

    loop(n, 0, 1)
  }

}
