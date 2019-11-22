package recursion

object Fact extends App {
  def fac(N: Int, result: Int): Int = {
    if(N==0 || N==1) result else fac(N-1,N*result)
  }
  println(fac(5,1))
}
