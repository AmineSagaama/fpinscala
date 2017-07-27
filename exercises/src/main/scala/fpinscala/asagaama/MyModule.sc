// a comment
/* another comment */
/** A documentation comment */
object MyModule {
  def main(args: Array[String]): Unit =
    println(formatAbs(-22))

  private def formatAbs(x: Int) = {
    val msg = "The absolute path of %d is %d"
    msg.format(x, abs(x))
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

}