object MyModule {

def squareSum(xs: List[Int]): Int = {
    xs.flatMap(n => List(n*n)).foldLeft(0)((x,y) => x+y)
}
  
def main(args: Array[String]): Unit = {
     println(squareSum(List(0,3,4,5)))
  }
}
