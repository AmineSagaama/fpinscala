// a comment
/* another comment */
/** A documentation comment */
object MyModule {
  def main(args: Array[String]): Unit =
    println(formatResult("absolute value", -3, abs))

  println(formatResult("factorial of", 5, factorial))

  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s path of %d is %d"
    msg.format(name, f(n))
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