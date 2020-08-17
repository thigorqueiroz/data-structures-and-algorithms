
object OddCount {


  def OddCount(n: Long): Long = {
    val num = n
    def go(n: Long, acc: Int): Long = {
      if(n<=0)acc
      else if(n%2 != 0 && n<num ) go(n-1,acc+1)
      else go(n-1,acc)
    }
    go(n, 0)
  }
  
  def main(args: Array[String]): Unit = {
    println(OddCount(15023))
  }
}
