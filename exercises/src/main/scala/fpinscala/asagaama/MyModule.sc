// a comment
/* another comment */
/** A documentation comment */
object MyModule {
  def main(args: Array[String]): Unit =
    println(formatAbs(-22))

  println(factorial(5))

  private def formatAbs(x: Int) = {
    val msg = "The absolute path of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

}